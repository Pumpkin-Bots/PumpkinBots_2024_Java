package frc.robot.commands;

public class GetPower {
    public static double getPower(double x, double y) {
        double hypotenuse;
        x = x * x;
        y = y * y;
        hypotenuse = x + y;
        hypotenuse = Math.sqrt(hypotenuse);
        System.err.println(hypotenuse);
        return hypotenuse;

    }
}
