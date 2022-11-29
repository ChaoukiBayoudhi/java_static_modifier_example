package MainPackage;

import package1.WebSite;

public class Main {
    public static void main(String[] args) {
        //English version of the website
        WebSite site1 = new WebSite();
        site1.setLanguage("en-US");
        //site1.colors[0]="Red";//colors is not accessible outside its package
        //so we need to use setter
        site1.setColors(new String[] {"Green", "Blue"});
        //site1.url="http://www.google.com"; //url is constant

    }
}