package chnu.edu.kn.ml;

public class Ellipse {
    private double semiMajorAxis;
    private double semiMinorAxis;

    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getSemiMinorAxis() {
        return semiMinorAxis;
    }

    public void setSemiMinorAxis(double semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }

    public double area() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    public double majorAxisLength() {
        return 2 * semiMajorAxis;
    }

    public double minorAxisLength() {
        return 2 * semiMinorAxis;
    }

    public double circumferenceApprox() {
        return Math.PI * (3 * (semiMajorAxis + semiMinorAxis)
                - Math.sqrt((3 * semiMajorAxis + semiMinorAxis) * (semiMajorAxis + 3 * semiMinorAxis)));
    }

    public double eccentricity() {
        return Math.sqrt(1 - (semiMinorAxis * semiMinorAxis) / (semiMajorAxis * semiMajorAxis));
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "semiMajorAxis=" + semiMajorAxis +
                ", semiMinorAxis=" + semiMinorAxis +
                '}';
    }
}