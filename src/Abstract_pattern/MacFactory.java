package Abstract_pattern;

public class MacFactory implements Factory{
    @Override
    public Window createWindow() {
        return new MacWindow();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}