	import java.util.Scanner;

// Implementing Runnable Interface
class MyRunnable implements Runnable {
    private String threadName;
    private Scanner scanner;

    public MyRunnable(String name, Scanner scanner) {
        threadName = name;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            
            // Simulating user typing after each iteration
            System.out.print("Type something for " + threadName + ": ");
            String userInput = scanner.nextLine();
            System.out.println(threadName + " received input: " + userInput);
            
            try {
                // Making the thread sleep for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }
}

public class multithread {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating instances of MyRunnable
        Runnable runnable1 = new MyRunnable("Thread 1", scanner);
        Runnable runnable2 = new MyRunnable("Thread 2", scanner);

        // Creating threads and passing runnable objects
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        // Starting the threads
        thread1.start();
        thread2.start();

        // Waiting for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Both threads have finished execution.");
    }
}

