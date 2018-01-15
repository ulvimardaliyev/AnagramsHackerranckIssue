
package hackerrankpro;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
public class HackerrankPro {

    
    public static void main(String[] args) {
        double ddd = 10.2112;
        Locale local = new Locale("en", "US") ;
        NumberFormat us = NumberFormat.getInstance(local);
        System.out.println(us.format(ddd));
        
        String a = "Ulvi";
        
    }
    
}
