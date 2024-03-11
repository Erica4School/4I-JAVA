
public class GameThread extends Thread {

	long lastTime = System.nanoTime();
	final double amountOfTicks = 60, period = 1000000000/amountOfTicks;
	double delta=0;
	
	int frames = 0, ticks = 0;
	long timer = System.currentTimeMillis();
	
	Game game;
	boolean running = true;

	public GameThread(Game game) {
		this.game = game;
	}

	public void run() {
		while(true) {
			if(!running) continue;
			long now = System.nanoTime();
			delta += (now-lastTime) / period;
			lastTime = now;
			if(delta >= 1) {
				tick();
				ticks ++;
				delta --;
			}

			render();
			frames ++;

			if(System.currentTimeMillis() - timer > 1000) {
				timer +=1000;
				System.out.println(ticks + " ticks, fps " + frames);
				ticks = 0;
				frames = 0;
			}

		}
	}

	private void tick() {
		game.tick();
	}

	private void render() {
		game.repaint();
	}

	public void setRunning(boolean b) {
		running = b;
	}
}
