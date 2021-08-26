public class Main {



    public static void main(String[] args) {
        int h = 10;
        float t = 0;
        Main.start(h, t);
    }

    private static void start(int height, float time) {
        int acceleration = -1;
        while(true) {
            System.out.println("Tid: " + time + " Höjd: " + height);
            checkCollision(height, acceleration);
            height = height+acceleration;
        }
    }

    private static int checkCollision(int height, int acceleration) {
        if (height == 0) {
            acceleration = 1;
        }
        return acceleration;
    }
}
