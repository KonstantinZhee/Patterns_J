package Patterns.Behavioral.Template;

public abstract class TemplatePage {
    public void showPage() {
        System.out.println("Header");
        showContext();
        System.out.println("Footer");
    }
    public abstract void showContext();
}
