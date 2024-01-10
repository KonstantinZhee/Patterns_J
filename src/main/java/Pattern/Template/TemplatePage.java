package Pattern.Template;

public abstract class TemplatePage {
    public void showPage() {
        System.out.println("Header");
        System.out.println("Footer");
    }
    public abstract void showContext();
}
