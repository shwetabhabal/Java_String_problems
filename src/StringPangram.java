public class StringPangram {
    public static boolean isPangram(String str){
        str = str.toLowerCase();
        boolean[] mark = new boolean[26];
        int index =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >='a' && str.charAt(i)<='z'){
                index = str.charAt(i) - 'a';
                mark[index] =true;
            }
        }
        for(int i=0; i<26; i++){
            if(mark[i] == false){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "the quick brown fox jumps over lazy dog";
        if(isPangram(str)== true){
            System.out.println("pangram");
        }else{
            System.out.println("not");;
        }
    }
}
