package hackerrankpro;

public class SubString1 {

    public static void main(String[] args) {
        SubString1 s = new SubString1();
        System.out.println(s.frontBack("Azerbaijan"));
    }

    public String frontBack(String str) {
        char arr[] = {str.charAt(0), str.charAt(str.length() - 1)};
        String newS = arr[1]+str.substring(1);
        
        return newS.substring(0, newS.length()-1)+arr[0];
    }
}
