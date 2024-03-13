public class Sender implements Runnable {
    private Data main;
    private String[] packets = {
        "First packet",
        "Second packet",
        "Third packet",
        "Fourth packet",
        "End"
    };

    public Sender(Data main) {
        this.main = main;
    }

    @Override
    public void run() {
        for (String packet : packets) {
            main.sendMessage(packet);
            try {
                Thread.sleep(1000); // Simula il tempo di elaborazione
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                
            }
        }
    }
}
