import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class CaricaSuonoWAV {

    public static void main(String[] args) {
        String filePath = "src/guitar.wav";

        try {
            File file = new File(filePath);

            // Creazione dell'oggetto AudioInputStream dal file WAV
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

            // Ottenere il formato dell'audio
           // AudioFormat format = audioInputStream.getFormat();

            // Creazione dell'oggetto Clip
            Clip clip = AudioSystem.getClip();

            // Apertura del clip con l'AudioInputStream
            clip.open(audioInputStream);

            System.out.println("Riproduzione in corso...");

            // Riproduzione del suono
            clip.start();

            // Attendi la fine della riproduzione
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            // Chiudi l'AudioInputStream e il Clip
            audioInputStream.close();
            clip.close();

            System.out.println("Riproduzione completata.");

        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
