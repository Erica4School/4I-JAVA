public class Receiver implements Runnable {
    private Data main;

    public Receiver(Data main) {
        this.main = main;
    }

    
    @Override
    public void run() {
        String message;
        while (!(message = main.receiveMessage()).equals("End")) {
            System.out.println("Received: " + message);
        }
    }

}
