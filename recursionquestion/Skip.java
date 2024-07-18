package recursionquestion;

public class Skip {
    public static void main(String[] args) {
       
        String inp = "abapplebcd";
       
        System.out.println( skipapple(inp));
    }

    // this function is for skipping the character
    // static String skip(String up){
    //     if(up.isEmpty()){
    //         return " ";
    //     }
    //     char ch = up.charAt(0);
    //     if(ch == 'a'){
    //         return skip(up.substring(1));

    //     }else{
    //         return ch  + skip(up.substring(1));
    //     }
    // }

    // this is for skipping the whole String 
    static String skipapple( String inp) {
        if (inp.isEmpty()) {
            return " ";
        }
        if (inp.startsWith("apple")) {
            return skipapple(inp.substring(5));

        }
        else{
            return inp.charAt(0)+skipapple(inp.substring(1));
        }
    }
}
