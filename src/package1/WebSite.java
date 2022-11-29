package package1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class WebSite {
    private String language; // =>attribute of instance : directly accessible only in the class
    String[] colors; //default attribute : directly accessible only in the class or in classes of same package

    private final String url="http://www.mysite.tn"; //constant Attribute
    private static long nbVisitors; //unique and common attribute => Class attribute : we can declare static attribute with private
                                    // or protected or public
                                    //accessible via class name (WebSite.nbVisitors)
    protected int x; //directly accessible in child class or in classes defined in the same package

    public WebSite(String language, String currency) {
        this.language = language;
        //url="http";//error because url is a constant attribute
    }

    public WebSite() {
    }

    public void print(){
        System.out.println("language: " + language);
        System.out.println("url: " + url);
        System.out.println("x: " + nbVisitors);
        System.out.println("x: " + x);}
    public static void showNbVisitors()
        {
            System.out.println("nbVisitors: " + nbVisitors);
            //System.out.println(language); //error because language is an instance attribute and showNbVisitors is a static method
        }

//    public String getLanguage() {
//        return language;
//    }
//
//    public void setLanguage(String language) {
//        this.language = language;
//    }
//
//
//
//    public String getUrl() {
//        return url;
//    }
//
//    public static long getNbVisitors() {
//        return nbVisitors;
//    }
//
//    public static void setNbVisitors(long nbVisitors) {
//        WebSite.nbVisitors = nbVisitors;
//    }
}
