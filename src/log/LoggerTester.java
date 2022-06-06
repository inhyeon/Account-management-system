package log;

public class LoggerTester { 
	
	public static void main(String[] args) {
		EventLogger logger = new EventLogger("log.txt");
		//"log.txt"이름의 파일이름을 가지는 로거 생성
		logger.log("test");
	}

}
