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
			//�α� ���� �غ�
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			// �ʵ��� �ʱ�ȭ�� ����� �߻� ���ɼ��� �־� �۷ι� �ΰ� ��ü�� ����ϱ� ���� ���
			filehandler = new FileHandler(fileName);
			// filehandler�� ���� ù��° �ɼ��� String���̰� �̴� �α� ������ ���ϸ��� �ȴ�.
			filehandler.setFormatter(new SimpleFormatter());
			// filehandler�� format������ �����ֱ� ���ؼ� SimpleFormater�� ������ش�.
			logger.addHandler(filehandler);
			//filehandler �̸��� ÷�� �ΰŸ� �߰��մϴ�.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void log(String logMessage) {
		logger.info(logMessage);
	}

}