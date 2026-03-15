package chnu.edu.kn.ml;

public class Main {
    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse(8, 5);

        System.out.println(ellipse.area());
        System.out.println(ellipse.majorAxisLength());
        System.out.println(ellipse.minorAxisLength());
        System.out.println(ellipse.circumferenceApprox());
        System.out.println(ellipse.eccentricity());
    }
}