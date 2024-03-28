public class Reverse {
    public static String Reverse(String str){
        String rev = "";
        for (int i=str.length()-1;i>=0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(Reverse(str));
    }
}