public class Demo1 {
    public static void main(String[] args) {
        String something = "hello";
        System.out.println(something.length());

        String something1 = "hello    ";
        System.out.println(something1.length());

        String something2 = "hello    ";
        System.out.println(something2.strip().length());

        //strip() + length()           this doesnt leading & trailing white spaces before checking
        String something3 = "    ";
        System.out.println(something3.isBlank());

        //this considers white spaces
        String something4 = "    ";
        System.out.println(something3.isEmpty());
    }
    
}
