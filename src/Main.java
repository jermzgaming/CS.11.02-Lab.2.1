/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Neo
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
    int addTwo = add(3, 8);
    int addFour = add(3, 8, 4, 9);
    String morning = morningGreeting("Toby Fox");
    String afternoon = afternoonGreeting("Max Miller");
    String tripleWord = triple("oohbaby");
    double halfNum = half(8);
    int roundPos = roundPositiveValueToNearestInteger(8.49);
    int roundNeg = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(addTwo);
        System.out.println(addFour);
        System.out.println(morning);
        System.out.println(afternoon);
        System.out.println(tripleWord);
        System.out.println(halfNum);
        System.out.println(roundPos);
        System.out.println(roundNeg);

    }

    // 1. add
    public static int add(int a, int b){
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d){
        return add(add(a, b), add(c, d));
    }
    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }
    // 5. triple
    public static String triple(String word){
        return word + word + word;
    }
    // 6. half
    public static double half(int n){
        return n / 2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double pos){
        return (int) (pos + 0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double neg){
        return (int) (neg - 0.5);
    }
}
