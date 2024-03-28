public class Vowels {
    public  static boolean hasVowels(String str) {
        str= str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != 'a' || str.charAt(i) != 'e' || str.charAt(i) != 'i' || str.charAt(i) != 'o' || str.charAt(i) != 'u') {
                return false;
            }
        }
        return true;
    }

    public static void countVowels(String str){
        str= str.toLowerCase();
        int c=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                c++;
            }
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        String str ="faaaghdd";
        countVowels(str);
        if(hasVowels(str)){
            System.out.println("has vowels");
        }
        else{
            System.out.println("not");
        }


    }
}
