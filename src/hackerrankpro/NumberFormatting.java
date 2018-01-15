package hackerrankpro;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        Locale india = new Locale("in", "IN");
        String hind = cust(india, payment);

        String us = printSomething(Locale.US, payment);
        System.out.println("US: " + us);
        System.out.println("India: " + hind);

        String china = printSomething(Locale.CHINA, payment);
        System.out.println("China: " + china);
        String france = printSomething(Locale.FRANCE, payment);
        System.out.println("France: " + france);

    }

    private static String printSomething(Locale locale, double payment) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        return formatter.format(payment);
    }

    public static String cust(Locale local, double payment) {
        Currency current = Currency.getInstance(local);

        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        dfs.setCurrencySymbol("Rs.");
        dfs.setGroupingSeparator(',');
        dfs.setMonetaryDecimalSeparator('.');
        ((DecimalFormat) nf).setDecimalFormatSymbols(dfs);
        return nf.format(payment);
    }
}
