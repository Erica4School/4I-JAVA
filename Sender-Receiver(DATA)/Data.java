//simuliamo l azione di 1 server e N client
public class Data {
    static String message = null;
    static boolean inviato = false;

    public static void main(String[] args) {
        Data main = new Data();
        Thread sender = new Thread(new Sender(main));
        Thread receiver = new Thread(new Receiver(main));
        Thread receiver2 = new Thread(new Receiver(main));
        sender.start();
        receiver.start();
        receiver2.start();
    }

    public synchronized void sendMessage(String msg) {
        while (inviato) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
               
            }
        }
        message = msg;
        inviato = true;
        notifyAll();
    }

    public synchronized String receiveMessage() {
        while (!inviato) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
             
            }
        }
        inviato = false;
        notifyAll();
        return message;
    }
}
