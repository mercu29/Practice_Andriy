package Task5_Command;
public class Application {
    private static Application instance = new Application();
    private Application(){}
    public static Application getInstance() {
        return instance;
    }
    private Menu menu = new Menu();
    public void run() {
        menu.add(new GenerateConsoleCommand());
        menu.add(new ViewConsoleCommand());
        menu.add(new ChangeConsoleCommand());
        menu.add(new SaveConsoleCommand());
        menu.add(new RestoreConsoleCommand());
        menu.execute();

    }
}