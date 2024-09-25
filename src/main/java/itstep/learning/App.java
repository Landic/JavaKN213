package itstep.learning;

import itstep.learning.oop.OopDemo;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        new Basics().run();
          new OopDemo().run();
//        percentDemo();
    }
    private static double sum;
    private static final Object sumlock = new Object();
    private static void percentDemo(){
        sum = 100.0;
        for (int i = 1; i <=12; i++){
            new Thread(new Rate(i)).start();
        }
    }


    private static class Rate implements Runnable{
        private final int month;


        public Rate(int month) {
            this.month = month;
        }

        @Override
        public void run() {
            System.out.println("Rate " + month + " started");
            double percent;
            try {
                Thread.sleep(500);
                percent = 10.0;
            }
            catch (InterruptedException e) {
                System.err.println(e.getMessage());
                return;
            }
            synchronized (sumlock){
                sum *= (1+ percent/100.0);
                System.out.println("Rate " + month + " finished with sum " + sum);
            }
        }
    }

}
