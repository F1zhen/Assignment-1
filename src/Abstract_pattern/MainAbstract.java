package Abstract_pattern;

public class MainAbstract {
    public static void main(String[] args) {
        Factory windFactory = new WindowsFactory();
        Factory macFactory = new MacFactory();

        Button windButton = windFactory.createButton();
        Window windWindow = windFactory.createWindow();
        Button macButton = macFactory.createButton();
        Window macWindow = macFactory.createWindow();

        windButton.click();
        windWindow.open();
        macButton.click();
        macWindow.open();
    }
}
