package com.example.demo.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;

/**
 * Created by GYH on 2021/8/31
 */
public class CreateInpHandler {
    private final Logger log = LoggerFactory.getLogger(this.getClass().getName());
    private final static long tryTime = 1000;
    private final static long waitTime = 1000 * 60 * 5; // 总等待5分钟

    public String write(InpDataMap dataMap) throws IOException {
//        String path = "";
        String path = "D:\\inp\\";
        String fileName = "123.inp";
        File inpFile = new File(path + File.separatorChar + fileName);
        log.info("开始写入inp: " + inpFile.getAbsolutePath());
        File fileParent = inpFile.getParentFile();
        if (!fileParent.exists()) {
            boolean mkdirs = fileParent.mkdirs();
            if (!mkdirs) throw new IllegalStateException("文件夹创建失败");
        }
        if (!inpFile.exists()) {
            boolean newFile = inpFile.createNewFile();//有路径才能创建文件
            if (!newFile) throw new IllegalStateException("文件创建失败");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(inpFile);
        FileLock fileLock = lock(fileOutputStream.getChannel(), waitTime);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, Charset.forName("GBK")))) {
            bufferedWriter.write("[TITLE]");
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write(dataMap.junctions.getString());
            bufferedWriter.write(dataMap.reservoirs.getString());
            bufferedWriter.write(dataMap.tanks.getString());
            bufferedWriter.write(dataMap.pipes.getString());
            bufferedWriter.write(dataMap.pumps.getString());
            bufferedWriter.write(dataMap.pumps.getString());
            bufferedWriter.write(dataMap.mixing.getString());
            bufferedWriter.write(dataMap.patterns.getString());
            bufferedWriter.write(dataMap.curves.getString());
            bufferedWriter.write(dataMap.quality.getString());
            bufferedWriter.write(dataMap.options.getString());
            bufferedWriter.write(dataMap.energy.getString());
            bufferedWriter.write(dataMap.reactions.getString());
            bufferedWriter.write(dataMap.valves.getString());
            bufferedWriter.write(dataMap.rulesControls.getString());
            bufferedWriter.write(dataMap.coordinateBuff.getString());
            bufferedWriter.write(dataMap.demands.getString());
            bufferedWriter.write(dataMap.source.getString());
            bufferedWriter.write(dataMap.statusBuff.getString());
            bufferedWriter.write(dataMap.times.getString());
            bufferedWriter.newLine();
            bufferedWriter.write("[END]");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            unlock(fileLock);
            bufferedWriter.close();
            log.info("写出完毕");
        } catch (IOException e) {
            log.error("inp写入失败", e);
            e.printStackTrace();
        }
        dataMap.cleanStringBuild();
        return inpFile.getPath();
    }

    public FileLock lock(FileChannel channel, long wait) {
        FileLock fileLock = null;
        long countTime = 0;
        while (fileLock == null) {
            try {
                fileLock = channel.tryLock();
            } catch (OverlappingFileLockException | IOException e) {
                if (countTime < wait) {
                    log.info(Thread.currentThread().getName() + " 等待 " + tryTime);
                    try {
                        Thread.sleep(tryTime);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    countTime += tryTime;
                } else {
                    log.info(Thread.currentThread().getName() + " 等待锁超时");
                    throw new IllegalStateException("获取inp文件锁超时");
                }
            }
        }
        log.info(Thread.currentThread().getName() + " 获取inp文件锁");
        return fileLock;
    }

    public void unlock(FileLock fileLock) {
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
