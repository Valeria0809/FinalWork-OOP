package logging;

public class ConsoleLogon implements Logon{
    @Override
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
