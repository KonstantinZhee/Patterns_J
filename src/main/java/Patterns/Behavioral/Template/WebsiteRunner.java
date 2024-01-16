package Patterns.Behavioral.Template;

public class WebsiteRunner {
    public static void main(String[] args) {
        TemplatePage welcomePage = new WelcomePage();
        welcomePage.showPage();
        System.out.println("++++++++");
        TemplatePage newsPage = new NewsPage();
        newsPage.showPage();
    }
}