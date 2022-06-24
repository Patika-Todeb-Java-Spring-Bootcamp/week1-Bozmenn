public class Main {
    public static void main(String[] args) {
        Producer p1 = new Producer();
        Consumer c1 = new Consumer();

        p1.start();
        while (p1.isAlive()) {

        }
        c1.start();
    }

}
