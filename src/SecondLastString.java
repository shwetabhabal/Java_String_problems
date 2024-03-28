public class SecondLastString {
    public static void main(String[] args) {
        String str = "hi how are you";
        String[] words = str.split("\\s");
        if(words.length >2){
            int i = words.length -2;
            String str1 = words[i];
            System.out.println(str1);
        }
        else{
            System.out.println("NA");
        }
    }
}
