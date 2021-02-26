@FunctionalInterface
public interface IMathFunction {
    int calculate(int a,int b);
    //Passing Lambda Expression as Function Parameter yo Print Result using Static Function
    static void printResult(int a , int b ,String function,IMathFunction fobj){
        System.out.println("Result of "+function+ " is "+fobj.calculate(a,b));
    }
}
