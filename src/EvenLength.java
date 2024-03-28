public class EvenLength {
    public static void evenlength(String str){
        String[] word = str.split("\\s");
        int[] wordlength = new int[word.length];
        for(int i=0; i<word.length; i++){
            wordlength[i] = word[i].length();
        }
        for(int i=0; i<word.length; i++){
            if(wordlength[i] % 2 ==0){
                System.out.println(word[i]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "this is dog";
        evenlength(str);
    }
}
