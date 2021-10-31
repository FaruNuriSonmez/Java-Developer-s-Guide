public class Main {

    public static void main(String[] args) {
        StopwatchThread thread1 = new StopwatchThread("Stopwatch1");
        StopwatchThread thread2 = new StopwatchThread("Stopwatch2");
        StopwatchThread thread3 = new StopwatchThread("Stopwatch3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
