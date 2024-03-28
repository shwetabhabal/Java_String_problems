public class WordCount {
    public static int wordCount(String str){
        int count = str.split("\\s").length;
        return count;
    }
    public static void main(String[] args) {
        String str= "this is word count program";
        System.out.println(wordCount(str));
    }
}
