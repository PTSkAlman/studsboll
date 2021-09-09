public class Main {

    public static void main(String[] args) {

        double deltaT = 0.1;
        double a = -9.82;
        double v0 = 0;
        double h = 10;
        double t = 0;

        for (int i = 0 ; i < 100 ; i++) {
            printPos(t, h);
            t += deltaT;
            v0 = updateVelocity(v0, a, deltaT);
            h = updatePosition(h, v0, deltaT);
            checkCollision(h, v0);
        }
    }

    private static void checkCollision(double h, double v0) {
        if (h < 0) {
            v0 = v0*-1;
        }
    }

    private static double updatePosition(double h, double v0, double deltaT) {

        return h + deltaT*v0;
    }

    private static double updateVelocity(double v0,double a, double deltaT) {
        return v0 + a*deltaT;
    }

    private static void printPos(double t, double h) {
        System.out.println(t + " ; " + h);
    }
}
