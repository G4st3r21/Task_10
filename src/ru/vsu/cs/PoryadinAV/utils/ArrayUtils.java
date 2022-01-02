package ru.vsu.cs.PoryadinAV.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class ArrayUtils {

    private static final Random RND = new Random();

    public static double[][] readDoubleArray2FromFile(String fileName) {
        try {
            return toDoubleArray2(readLinesFromFile(fileName));
        }
        catch(FileNotFoundException e) {
            return null;
        }
    }

    public static double[][] toDoubleArray2(String[] lines) {
        double[][] arr2 = new double[lines.length][];
        for (int r = 0; r < lines.length; r++) {
            arr2[r] = toDoubleArray(lines[r]);
        }
        return arr2;
    }

    public static String[] readLinesFromFile(String fileName) throws FileNotFoundException {
        List<String> lines;
        try (Scanner scanner = new Scanner(new File(fileName), "UTF-8")) {
            lines = new ArrayList<>();
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
            // обязательно, чтобы закрыть открытый файл
        }
        return lines.toArray(new String[0]);
    }


    public static double[] toDoubleArray(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Double> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextDouble());
        }

        // из List<Double> можно получить Double[]
        Double[] arr = list.toArray(new Double[0]);
        // Double[] -> double[]
        return ArrayUtils.toPrimitive(arr);
    }

    public static double[] toPrimitive(Double[] arr) {
        if (arr == null) {
            return null;
        }
        double[] result = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // автоматическая распаковка из объекта
            result[i] = arr[i];
        }
        return result;
    }

    public static void writeTriangleArrayToFile(String fileName, String[] arr1, String[] arr2, String itemFormat)
            throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(fileName)) {
            out.println("Исходный список треугольников:");
            out.println("\t" + Arrays.toString(arr1));
            out.println();
            out.println("Итоговый список треугольников:");
            out.println("\t" + Arrays.toString(arr2));
        }
    }

    public static void writeTriangleArrayToFile(String fileName, double[][] arr2, String itemFormat)
            throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(fileName)) {
            out.println(toString(arr2, itemFormat));
        }
    }

    public static String toString(double[][] arr2, String itemFormat) {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < arr2.length; r++) {
            if (r > 0) {
                sb.append(System.lineSeparator());
            }
            sb.append(toString(arr2[r], itemFormat));
        }
        return sb.toString();
    }
    public static String toString(double[] arr, String itemFormat) {
        if (arr == null) {
            return null;
        }
        if (itemFormat == null || itemFormat.length() == 0) {
            itemFormat = "%s";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(String.format(Locale.ROOT, itemFormat, arr[i]));
        }
        return sb.toString();
    }



    public static double[] createRandomDoubleArray(int length, int minValue, int maxValue) {
        double[] arr = new double[length];
        for (int i = 0; i < length; i++)
            arr[i] = minValue + RND.nextDouble(maxValue - minValue);
        return arr;
    }

    public static double[][] createRandomDoubleMatrix(int rowCount, int colCount, int minValue, int maxValue) {
        double[][] matrix = new double[rowCount][];
        for (int r = 0; r < rowCount; r++)
            matrix[r] = createRandomDoubleArray(colCount, minValue, maxValue);
        return matrix;
    }

}
