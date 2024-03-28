public class IncreaseCharby1 {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                char newch = (char)(ch+1);
                str1 += newch;
            }else{
            str1+=ch;
        }
        }
        System.out.println(str1);
    }
}
