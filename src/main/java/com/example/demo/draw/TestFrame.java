package com.example.demo.draw;

import com.example.demo.model.OcPoint;
import com.example.demo.model.OcPool;
import com.example.demo.model.OcReservoir;
import com.example.demo.simplify.NetworkDataInfo;
import com.example.demo.simplify.SimpleNode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author EdwinD
 * @create 2020.08.16 上午 10:03
 * @desc
 **/
public class TestFrame {
    public JPanel pan;
    private JFrame frame;
    private Image image;
    private final int width = 1400;
    private final int height = 1000;
    private double x = 0;
    private double y = 0;
    private double size = 0;
    private double xOffset = 0;
    private double yOffset = 0;
    private NetworkDataInfo dataInfo;

    public static void main(String[] args) throws InterruptedException {
        TestFrame testFrame = new TestFrame();
        testFrame.start();
        Thread.sleep(100);
        testFrame.draw(0);
        testFrame.pan.requestFocus();
    }

    public void start() {
        JFrame frame = new JFrame("My First Java 图形界面");
//        设置窗口可见性,无关于窗口大小.
        frame.setVisible(true);
//        设置窗口大小
        frame.setSize(width, height);
//        设置背景颜色
//        frame.setBackground(new Color(77, 77, 77));
//        设置初始位置
        frame.setLocation(277, 27);
        JPanel pan = new JPanel();
        pan.setSize(width, height);
        pan.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (e.getKeyChar() == '=') {
                    size = size * 1.5;
                    xOffset *= 1.5;
                    yOffset *= 1.5;
                    draw();
                } else if (e.getKeyChar() == '-') {
                    size = size / 1.5;
                    xOffset /= 1.5;
                    yOffset /= 1.5;
                    draw();
                } else if (e.getKeyChar() == 'w') {
                    yOffset -= 20;
                    draw();
                } else if (e.getKeyChar() == 's') {
                    yOffset += 20;
                    draw();
                } else if (e.getKeyChar() == 'a') {
                    xOffset += 20;
                    draw();
                } else if (e.getKeyChar() == 'd') {
                    xOffset -= 20;
                    draw();
                }
                System.out.println(e.getKeyChar() + " " + size + " " + xOffset + " " + yOffset);
            }

        });
        this.pan = pan;
        pan.setBackground(Color.white);
        frame.add(pan);
//        控制窗口大小是否可改变,默认为True,即可以改变。
        frame.setResizable(false);
        this.frame = frame;
        image = pan.createImage(width, height);
    }

    public void draw(int offset) {
        image = pan.createImage(width, height);
        Graphics g = image.getGraphics();
        Graphics2D g2 = (Graphics2D) g;

        g2.drawOval(5 + offset, 5, 100, 100); // 绘制圆形
        g2.fillRect(15 + offset, 15, 80, 80); // 绘制实心矩形

        pan.getGraphics().drawImage(image, 0, 0, null);

//        pan.repaint();
    }

    public void setDataInfo(NetworkDataInfo dataInfo) {
        this.dataInfo = dataInfo;
        x = Integer.MAX_VALUE;
        y = Integer.MAX_VALUE;
        double maxX = 0;
        double maxY = 0;
        for (OcPoint p : dataInfo.points) {
            if (p.getLongitude() < x) x = p.getLongitude();
            if (p.getLongitude() > maxX) maxX = p.getLongitude();
            if (p.getLatitude() < y) y = p.getLatitude();
            if (p.getLatitude() > maxY) maxY = p.getLatitude();
        }
        for (OcPool p : dataInfo.pools) {
            if (p.getLongitude() < x) x = p.getLongitude();
            if (p.getLongitude() > maxX) maxX = p.getLongitude();
            if (p.getLatitude() < y) y = p.getLatitude();
            if (p.getLatitude() > maxY) maxY = p.getLatitude();
        }
        for (OcReservoir p : dataInfo.reservoirs) {
            if (p.getLongitude() < x) x = p.getLongitude();
            if (p.getLongitude() > maxX) maxX = p.getLongitude();
            if (p.getLatitude() < y) y = p.getLatitude();
            if (p.getLatitude() > maxY) maxY = p.getLatitude();
        }
        double xDeviation = maxX - x;
        double yDeviation = maxY - y;
        size = Math.min(width / xDeviation, height / yDeviation);
        System.out.println(x + " " + y);
    }

    public void print(SimpleNode o) {
        double lon = 0, lat = 0;
        if (o.target instanceof OcPoint) {
            OcPoint o1 = (OcPoint) o.target;
            lon = o1.getLongitude();
            lat = o1.getLatitude();
        } else if (o.target instanceof OcPool) {
            OcPool o1 = (OcPool) o.target;
            lon = o1.getLongitude();
            lat = o1.getLatitude();
        } else if (o.target instanceof OcReservoir) {
            OcReservoir o1 = (OcReservoir) o.target;
            lon = o1.getLongitude();
            lat = o1.getLatitude();
        }
        Graphics g = image.getGraphics();
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.fillOval((int) ((lon - x) * size + xOffset), -(int) ((lat - y) * size + yOffset - height), 8, 8);
        pan.getGraphics().drawImage(image, 0, 0, null);
    }

    public void draw() {
        if (dataInfo == null) return;
        image = pan.createImage(width, height);
        Graphics g = image.getGraphics();
        Graphics2D g2 = (Graphics2D) g;
        dataInfo.points.forEach(p -> {
            if (p.getFlag() == 1)
                drawPoint(p.getLongitude(), p.getLatitude(), g2);
        });
        dataInfo.pools.forEach(p -> {
            if (p.getFlag() == 1)
                drawPoint(p.getLongitude(), p.getLatitude(), g2);
        });
        dataInfo.reservoirs.forEach(p -> {
            if (p.getFlag() == 1)
                drawPoint(p.getLongitude(), p.getLatitude(), g2);
        });
        dataInfo.pipes.forEach(p -> {
            if (p.getFlag() == 1)
                drawLine(p.getStartLongitude(), p.getStartLatitude(), p.getEndLongitude(), p.getEndLatitude(), g2);
        });
        dataInfo.valves.forEach(p -> {
            if (p.getFlag() == 1)
                drawLine(p.getStartLongitude(), p.getStartLatitude(), p.getEndLongitude(), p.getEndLatitude(), g2);
        });
        dataInfo.pumps.forEach(p -> {
            if (p.getFlag() == 1)
                drawLine(p.getStartLongitude(), p.getStartLatitude(), p.getEndLongitude(), p.getEndLatitude(), g2);
        });
        pan.getGraphics().drawImage(image, 0, 0, null);
    }

    private void drawPoint(Double longitude, Double latitude, Graphics2D g2) {
        int px = (int) ((longitude - x) * size + xOffset);
        int py = -(int) ((latitude - y) * size + yOffset - height);
        if (px <= width && px >= 0 && py >= 0 && py <= height)
            g2.fillOval(px, py, 8, 8);
    }

    private void drawLine(Double startLongitude, Double startLatitude, Double endLongitude, Double endLatitude, Graphics2D g2) {
        int x1 = (int) ((startLongitude - x) * size + xOffset + 4);
        int y1 = -(int) ((startLatitude - y) * size + yOffset - 4 - height);
        int x2 = (int) ((endLongitude - x) * size + xOffset + 4);
        int y2 = -(int) ((endLatitude - y) * size + yOffset - 4 - height);
        if ((x1 <= width && x1 >= 0 && y1 >= 0 && y1 <= height) || (x2 <= width && x2 >= 0 && y2 >= 0 && y2 <= height))
            g2.drawLine(x1, y1, x2, y2);
    }

}

