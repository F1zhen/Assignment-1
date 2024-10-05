package Abstract_pattern;

public class WindowButton implements Button{
    @Override
    public void click() {
        System.out.println("Click on windows");
    }
}