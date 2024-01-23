package Under;
public class Timer {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.start();
        
        // Perform some task or wait for a certain period of time

        timer.stop();
        long elapsedTime = timer.getElapsedTime();
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }
}