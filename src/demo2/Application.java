package demo2;

/**
 * @author Lhouceine OUHAMZA
 */

/**
 * Repeat instruction
 * using local method
 * Interface / implementation
 * Anonymous class
 * Lambda expression
 */
public class Application {
    public static void main(String[] args){

        Hello hello =  str -> System.out.println("salam " + str);
        hello.show("amis");
    }
}

