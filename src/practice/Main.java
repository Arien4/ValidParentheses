package practice;

public class Main {

    public static void main(String[] args) {
        //String s = "[]{}()()([{}])";
        //String s = "[]{}(())()([{}])";
        //String s = "()()()";
        String s ="{}{}{{}}";

        System.out.println("The string " + s + " is" + (isValid(s) ? "" : " not") + " valid");

    }

    public static boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        return deleteParentheses(sb).length() == 0;

    }

    public static StringBuilder deleteParentheses(StringBuilder sb) {
        int p1 = sb.indexOf("()");
        if (p1 >= 0) {
            sb.delete(p1, p1 + 2);
        }
        int p2 = sb.indexOf("[]");
        if (p2 >= 0) {
            sb.delete(p2, p2 + 2);
        }
        int p3 = sb.indexOf("{}");
        if (p3 >= 0) {
            sb.delete(p3, p3 + 2);
        }
        //System.out.println(sb + " " + p1 + p2 + p3);
        if (sb.length() > 0 && (p1 >= 0 || p2 >= 0 || p3 >= 0)) {
            deleteParentheses(sb);
        } else {
            return sb;
        }
        return sb;

    }
}
