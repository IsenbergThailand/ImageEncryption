import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.FileAppender;
public class Testlog4j {
static Logger logger = Logger.getLogger(Testlog4j.class);//(1)
public static void main(String args[]) {
SimpleLayout layout = new SimpleLayout();//(2)
FileAppender appender = null;
try {
appender = new FileAppender(layout,"output1.txt",false);//(3)
} catch(Exception e) {}
logger.addAppender(appender);//(4)
logger.setLevel((Level) Level.DEBUG);//(5)
logger.debug("Here is some DEBUG");//(6.1)
logger.info("Here is some INFO");//(6.2)
logger.warn("Here is some WARN");//(6.3)
logger.error("Here is some ERROR");//(6.4)
logger.fatal("Here is some FATAL");//(6.5)
}
}