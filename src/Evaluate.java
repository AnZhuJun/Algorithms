import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        String string = "((2+((2+3)*(4*5)))/2)";
        System.out.println(string);

        while(!string.isEmpty()){
            String s = String.valueOf(string.charAt(0));
            string = string.substring(1);

            if(s.equals("("))
                ;
            else if (s.equals("+"))
                ops.push(s);
            else if (s.equals("-"))
                ops.push(s);
            else if (s.equals("*"))
                ops.push(s);
            else if (s.equals("/"))
                ops.push(s);
            else if (s.equals("sqrt"))
                ops.push(s);
            else if (s.equals(")")){
                String op = ops.pop();
                Double v = vals.pop();

                if(op.equals("+"))
                    v = vals.pop() + v;
                else if(op.equals("-"))
                    v = vals.pop() - v;
                else if(op.equals("*"))
                    v = vals.pop() * v;
                else if(op.equals("/"))
                    v = vals.pop() / v;
                else if(op.equals("sqrt"))
                    v = Math.sqrt(v);
                vals.push(v);
            }
            else vals.push(Double.valueOf(s));
        }
        System.out.println(vals);


    }
}
