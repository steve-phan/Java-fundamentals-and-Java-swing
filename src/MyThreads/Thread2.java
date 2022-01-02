package MyThreads;

public class Thread2 extends Thread {
     int count;
    @Override
    public void run() {
          for(int i = 0; i < 10; i++) {
            System.out.println("Hello Thread #2 " + i );
//            if(i == 1) {
//                System.out.println(1 / 0);
//            }
        }
    }

}
