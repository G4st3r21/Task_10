package ru.vsu.cs.PoryadinAV;

import ru.vsu.cs.PoryadinAV.utils.ArrayUtils;
import ru.vsu.cs.PoryadinAV.utils.TriangleUtils;

import java.io.PrintStream;
import java.util.List;
import java.util.Locale;

public class ConsoleMain {

    public static class CmdParams {
        public String inputFile;
        public String outputFile;
        public boolean error;
        public boolean help;
        public boolean window;
    }

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);

        TriangleUtils program = new TriangleUtils();
        CmdParams cmdParams = parseArgs(args);

        if (cmdParams.help) {
            printHelp(cmdParams);
        }

        if (cmdParams.window) {
            GuiMain.winMain();
        } else if (cmdParams.inputFile != null) {
            double[][] trianglesApexes = ArrayUtils.readDoubleArray2FromFile(cmdParams.inputFile);

            if (!program.validationInputByConditional(trianglesApexes)) {
                printWrongInput();
            }
            else {
                List<Triangle> input = program.toTriangleList(trianglesApexes);
                List<Triangle> answer = program.triangleSorting(input);

                if (cmdParams.outputFile != null) {
                    ArrayUtils.writeTriangleArrayToFile(cmdParams.outputFile, program.toStringArray(input),
                            program.toStringArray(answer), null);
                } else {
                    program.printTriangles(answer);
                }
            }
        }

    }

    public static CmdParams parseArgs(String[] args) {
        CmdParams params = new CmdParams();
        if (args.length > 0) {
            if (args[0].equals("--help")) {
                params.help = true;
                return params;
            }
            if (args[0].equals("--window")) {
                params.window = true;
                return params;
            }
            params.inputFile = args[0];
            if (args.length >= 2) {
                params.outputFile = args[1];
            }
        } else {
            params.help = true;
            params.error = true;
        }
        return params;
    }

    public static void printHelp(CmdParams params) {
        PrintStream out = params.error ? System.err : System.out;
        out.println("Usage:");
        out.println("  <cmd> args <input-file> (<output-file>)");
        out.println("  <cmd> --help");
        out.println("  <cmd> --window  // show window");
        System.exit(params.error ? 1 : 0);
    }

    public static void printWrongInput() {
        System.out.println("Треугольники должны быть описаны в следующем формате:");
        System.out.println("    x1 y1 x2 y2 x3 y3");
        System.out.println("    x1 y1 x2 y2 x3 y3");
        System.out.println("    x1 y1 x2 y2 x3 y3");
        System.out.println("(в одной строке 6 чисел через пробел)");
    }
}
