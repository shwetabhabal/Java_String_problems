public class EvenIndex {
    public static void main(String[] args) {
        String str = "hello world";
        for(int i=0; i<str.length();i++){
            if(i%2 == 0){
                System.out.println(str.charAt(i));
            }
        }
    }
}
