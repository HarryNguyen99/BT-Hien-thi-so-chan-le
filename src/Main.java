public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        Thread thread1 = new Thread(oddThread);
        Thread thread2 = new Thread(evenThread);

        thread1.start();
        try {
            thread1.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        thread2.start();
    }
}
