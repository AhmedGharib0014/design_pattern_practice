package behavioral.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression extends Expression{

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        StringTokenizer st = new StringTokenizer(context);

        while (st.hasMoreTokens()){
            String test = st.nextToken();
            if(test.contains(data)){
                return true;
            }
        }

        return false;
    }
}
