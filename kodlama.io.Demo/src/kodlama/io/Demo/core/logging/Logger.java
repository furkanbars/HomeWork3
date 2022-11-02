package kodlama.io.Demo.core.logging;

public class Logger implements ILogger{
	public void log(String message) {
		System.out.println("Logglama başarıyla yapıldı : "+message);
	}

}
