public class KronometreTherad implements Runnable {
    private Thread thread;
    private String threadName;

    public KronometreTherad(String threadName) {
        this.threadName = threadName;
        System.out.println("oluşturuluyor" + threadName);
    }

    @Override
    public void run() {
        System.out.println("Çalıştılıyor" + threadName);


        for (int i = 0; i <= 10; i++) {
            System.out.println(threadName + "  :  " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Kesildi" + threadName);
            }
        }


        System.out.println("Thread bitti : "+threadName);
    }
    public void start(){
        System.out.println("Theread nesnesi oluştuluyor");
        if (thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }



}
