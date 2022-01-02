package MyThreads;

public class Thread1 extends Thread{
    int count;
    @Override
    public void run() {
        for(int i = 10; i > 0; i--) {
            System.out.println("Hello Thread #1 " + i );

        }
    }
}
