public class Main {

    public static void main(String[] args) {

        double time = 0;
        double a = -9.82;
        double v0 = 0;
        double h0 = 10;
        double h1 = 0;
        double v1 = 0;

        double delta = 1000/60;
        long last = System.currentTimeMillis();
        while (true) {
            long now = System.currentTimeMillis();
            if (now - last > delta) {
                time++;
                v1 = v0 + a*delta;
                h1 = h0 + v0*delta;
                v0 = v1;
                h0 = h1;
                System.out.println("t: " + time/1000 + " h: " + h0);
            }
        }
    }
}
