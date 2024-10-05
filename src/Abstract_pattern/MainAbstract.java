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


// The Abstract Design Pattern is a design pattern that provides a way to define a family of related or dependent objects without specifying their concrete classes.
// It is very useful when you want to ensure that your code is flexible and can work with different types of objects.