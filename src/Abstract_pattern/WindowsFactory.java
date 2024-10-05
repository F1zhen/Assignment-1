package Abstract_pattern;

public class WindowsFactory implements  Factory{
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }


}