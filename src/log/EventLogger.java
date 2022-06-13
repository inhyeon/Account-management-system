package log;
 
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	FileHandler filehandler;

	LogManager logmanager;
	Logger logger;
	
	public EventLogger(String fileName) {
		try {
			logmanager = LogManager.getLogManager();
			//로그 파일 준비
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			// 필드의 초기화시 데드락 발생 가능성이 있어 글로벌 로거 객체를 취득하기 위한 방법
			filehandler = new FileHandler(fileName);
			// filehandler에 들어가는 첫번째 옵션은 String형이고 이는 로그 파일의 파일명이 된다.
			filehandler.setFormatter(new SimpleFormatter());
			// filehandler의 format형식을 정해주기 위해서 SimpleFormater를 등록해준다.
			logger.addHandler(filehandler);
			//filehandler 이름의 첨부 로거를 추가합니다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void log(String logMessage) {
		logger.info(logMessage);
	}

}