package com.example.demo.model;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by GYH on 2021/8/25
 */
public class CodeCoordinateMapResponse {
    private List<CodeLinkCoordinateResponse> lines = new LinkedList<>();
    private List<CodeNodeCoordinateResponse> nodes = new LinkedList<>();
}
