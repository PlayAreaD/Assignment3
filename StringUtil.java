public class StringUtil {        //string are immutable
    public static void main(String[] args) {
        String something = "hello string";
        //System.out.println(something.toUpperCase());
        // System.out.println(something);
        // String something1 = something.toUpperCase();
        // System.out.println(something1);

        String something2 = "     hello string     ";
        System.out.println(something2.strip());
        System.out.println(something2);
        String something3 = something.strip();
        System.out.println(something3);

        String newSomething = "Hello there I am from";
        String partednewSomething = newSomething.substring(6);
        System.out.println(partednewSomething);

    }
    
}
