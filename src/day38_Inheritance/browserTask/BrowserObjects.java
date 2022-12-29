package day38_Inheritance.browserTask;

public class BrowserObjects {
    public static void main(String[] args) {
        Browser ch1 = new Browser();
        Safari sf1 = new Safari();
        Opera op1 = new Opera();
        FireFox ff1 = new FireFox();

        ch1.openBrowser();
        sf1.closeBrowser();
        op1.openBrowser();
        ff1.closeBrowser();
    }
}
