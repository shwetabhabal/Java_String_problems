public class AsciiValueString {
    public static void main(String[] args) {
        String str = "Hello world";
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            System.out.println((int) ch);
        }
    }
}
