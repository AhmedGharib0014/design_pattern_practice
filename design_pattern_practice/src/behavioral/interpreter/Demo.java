package behavioral.interpreter;

public class Demo {

    public static Expression buildExpression(){

        Expression terminal1= new TerminalExpression("elephant");

        Expression terminal2= new TerminalExpression("loin");

        return new AndExpression(terminal2,terminal1);
    }

    public static void main(String[] args) {
        String context1 = "loin and elephant";
        String context2 = "lion";

        Expression expression= buildExpression();

        System.out.println(expression.interpret(context1));
        System.out.println(expression.interpret(context2));

    }
}
