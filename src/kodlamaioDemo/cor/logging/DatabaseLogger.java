package kodlamaioDemo.cor.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Database'e loglandi");
		
	}

}
