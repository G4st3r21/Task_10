package ru.vsu.cs.PoryadinAV;

public class Triangle {
    private final int number;
    private final double apex1X;
    private final double apex2X;
    private final double apex3X;
    private final double apex1Y;
    private final double apex2Y;
    private final double apex3Y;
    private final double area;
    private final boolean isPossible;

    public Triangle(int number, double apex1X, double apex2X, double apex3X, double apex1Y, double apex2Y, double apex3Y) {
        this.number = number;
        this.apex1X = apex1X;
        this.apex2X = apex2X;
        this.apex3X = apex3X;
        this.apex1Y = apex1Y;
        this.apex2Y = apex2Y;
        this.apex3Y = apex3Y;

        this.area = 1.0/2.0 * Math.abs((apex2X - apex1X) * (apex3Y - apex1Y) - (apex3X - apex1X) * (apex2Y - apex1Y));

        this.isPossible = isPossibleTriangle();
    }

    public int getNumber() { return number;}

    public double[] getApexes1() {
        return new double[]{apex1X, apex1Y};
    }

    public double[] getApexes2() {
        return new double[]{apex2X, apex2Y};
    }

    public double[] getApexes3() {
        return new double[]{apex3X, apex3Y};
    }

    public double getArea() {
        return area;
    }

    public boolean getIsPossible() {
        return isPossible;
    }

    public boolean compareTo(Triangle other) {
        return this.area >= other.area;
    }

    public String toString() {
        return "Треугольник №" + number + " с площадью " + String.format("%.2f", area);
    }

    public boolean isPossibleTriangle() {
        return ((apex1X == apex2X && apex1X == apex3X) || (apex1Y == apex2Y && apex1Y == apex3Y));
    }
}
