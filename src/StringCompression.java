public class StringCompression {
    public static String compression(String str){
        String compress = "";
        int count =0;
        for(int i=0; i<str.length(); i++){
            count ++;
            if(str.charAt(i) != str.charAt(i+1) || i+1 >= str.length() ){
                compress += str.charAt(i);
                compress += count;
                count =0;
            }
        }
        return compress.length()< str.length() ? compress: str;
    }
    public static void main(String[] args) {
        String str ="aabbbbccc";
        System.out.println(compression(str));;
    }
}
