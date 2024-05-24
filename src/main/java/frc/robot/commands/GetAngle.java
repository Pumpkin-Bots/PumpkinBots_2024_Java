package frc.robot.commands;

public class GetAngle {
    public static double getControllerAngle(double x, double y) {
        switch (GetQuadrant.getControllerQuadrant(x, y)) {
            case 1:
                return (Math.asin(y / Math.hypot(x, y)) * 180 / Math.PI) + 90;
            case 2:
                return (180 - Math.asin(y / Math.hypot(x, y)) * 180 / Math.PI) + 90;
            case 3:
                return (180 + (-1 * Math.asin(y / Math.hypot(x, y)) * 180 / Math.PI)) + 90;
            case 4:
                return ((360 + Math.asin(y / Math.hypot(x, y)) * 180 / Math.PI) - 270);
            default:
                return 0;
        }
    }
}
