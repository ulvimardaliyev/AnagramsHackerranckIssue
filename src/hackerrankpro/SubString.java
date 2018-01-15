
package hackerrankpro;


public class SubString {
    public static void main(String[] args) {
        SubString ss = new SubString();
        System.out.println(ss.missingChar("kitten",4));
    }
    public String missingChar (String str, int n){
        String firstPlace = str.substring(0, n)+str.substring(n+1, str.length());
        return firstPlace;
        
        
    }
}
