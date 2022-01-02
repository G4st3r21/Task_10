package ru.vsu.cs.PoryadinAV;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.vsu.cs.PoryadinAV.utils.ArrayUtils;
import ru.vsu.cs.PoryadinAV.utils.TriangleUtils;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;

public class TriangleUtilsTest {
    TriangleUtils program = new TriangleUtils();

    @Test
    public void testNormalCase() throws FileNotFoundException {
        Locale.setDefault(Locale.ROOT);

        double[][] trianglesApexes = ArrayUtils.readDoubleArray2FromFile("testSrc/normalCase.txt");

        List<Triangle> input = program.toTriangleList(trianglesApexes);
        List<Triangle> answer = program.triangleSorting(input);

        ArrayUtils.writeTriangleArrayToFile("testSrc/temp.txt", program.toStringArray(input),
                program.toStringArray(answer), null);

        String[] expectedResult = ArrayUtils.readLinesFromFile("testSrc/normalCaseOutput.txt");
        String[] receivedResult = ArrayUtils.readLinesFromFile("testSrc/temp.txt");


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void testCaseWithUnusualInput() throws FileNotFoundException {
        Locale.setDefault(Locale.ROOT);

        double[][] trianglesApexes = ArrayUtils.readDoubleArray2FromFile("testSrc/caseWithUnusualInput.txt");

        List<Triangle> input = program.toTriangleList(trianglesApexes);
        List<Triangle> answer = program.triangleSorting(input);

        ArrayUtils.writeTriangleArrayToFile("testSrc/temp.txt", program.toStringArray(input),
                program.toStringArray(answer), null);

        String[] expectedResult = ArrayUtils.readLinesFromFile("testSrc/caseWithUnusualInputOutput.txt");
        String[] receivedResult = ArrayUtils.readLinesFromFile("testSrc/temp.txt");


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void testCaseWithUnusualInput2() throws FileNotFoundException {
        Locale.setDefault(Locale.ROOT);

        double[][] trianglesApexes = ArrayUtils.readDoubleArray2FromFile("testSrc/caseWithUnusualInput2.txt");

        List<Triangle> input = program.toTriangleList(trianglesApexes);
        List<Triangle> answer = program.triangleSorting(input);

        ArrayUtils.writeTriangleArrayToFile("testSrc/temp.txt", program.toStringArray(input),
                program.toStringArray(answer), null);

        String[] expectedResult = ArrayUtils.readLinesFromFile("testSrc/caseWithUnusualInputOutput2.txt");
        String[] receivedResult = ArrayUtils.readLinesFromFile("testSrc/temp.txt");


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void testCaseWithUnusualInput3() throws FileNotFoundException {
        Locale.setDefault(Locale.ROOT);

        double[][] trianglesApexes = ArrayUtils.readDoubleArray2FromFile("testSrc/caseWithUnusualInput3.txt");

        List<Triangle> input = program.toTriangleList(trianglesApexes);
        List<Triangle> answer = program.triangleSorting(input);

        ArrayUtils.writeTriangleArrayToFile("testSrc/temp.txt", program.toStringArray(input),
                program.toStringArray(answer), null);

        String[] expectedResult = ArrayUtils.readLinesFromFile("testSrc/caseWithUnusualInputOutput3.txt");
        String[] receivedResult = ArrayUtils.readLinesFromFile("testSrc/temp.txt");


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void testCaseWithBigInput() throws FileNotFoundException {
        Locale.setDefault(Locale.ROOT);

        double[][] trianglesApexes = ArrayUtils.readDoubleArray2FromFile("testSrc/caseWithBigInput.txt");

        List<Triangle> input = program.toTriangleList(trianglesApexes);
        List<Triangle> answer = program.triangleSorting(input);

        ArrayUtils.writeTriangleArrayToFile("testSrc/temp.txt", program.toStringArray(input),
                program.toStringArray(answer), null);

        String[] expectedResult = ArrayUtils.readLinesFromFile("testSrc/caseWithBigInputOutput.txt");
        String[] receivedResult = ArrayUtils.readLinesFromFile("testSrc/temp.txt");


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }
}