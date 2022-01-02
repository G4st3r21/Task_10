package ru.vsu.cs.PoryadinAV.utils;

import ru.vsu.cs.PoryadinAV.Triangle;

import java.util.ArrayList;
import java.util.List;

public class TriangleUtils {

    public List<Triangle> triangleSorting(List<Triangle> triangles) {
        if (triangles.size()  < 2) {
            return triangles;
        } else {

            double pivot = triangles.get(0).getArea();
            List<Triangle> lessThanPivot = new ArrayList<>();
            List<Triangle> overThanPivot = new ArrayList<>();

            for (int i = 1; i < triangles.size(); i++) {
                double value = triangles.get(i).getArea();
                if (value > pivot) {
                    overThanPivot.add(triangles.get(i));
                } else {
                    lessThanPivot.add(triangles.get(i));
                }
            }

            List<Triangle> answer = new ArrayList<>();
            answer.addAll(triangleSorting(lessThanPivot));
            answer.add(triangles.get(0));
            answer.addAll(triangleSorting(overThanPivot));

            return answer;
        }
    }

    public List<Triangle> toTriangleList(double[][] trianglesApexes) {
        List<Triangle> triangles = new ArrayList<>();

        if (trianglesApexes.length  == 0) return triangles;


        for (int i = 0; i < trianglesApexes.length; i++) {
            triangles.add(new Triangle(i + 1, trianglesApexes[i][0], trianglesApexes[i][1], trianglesApexes[i][2],
                    trianglesApexes[i][3], trianglesApexes[i][4], trianglesApexes[i][5]));
        }

        return triangles;
    }


    public boolean validationInputByConditional(double[][] trianglesApexes) {
        if (trianglesApexes.length  == 0) return true;

        for (double[] coordinates : trianglesApexes) {
            if (coordinates.length != 6) {
                return false;
            }
        }

        return true;
    }

    public void printTriangles(List<Triangle> triangles) {
        for (Triangle triangle: triangles) {
            System.out.print(triangle.toString() + "\t");
        }
        System.out.println();
    }

    public String[] toStringArray(List<Triangle> triangles) {
        String[] answer = new String[triangles.size()];
        for (int i = 0; i < triangles.size(); i++) {
            answer[i] = triangles.get(i).toString();
        }

        return answer;
    }

}
