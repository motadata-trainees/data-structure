import java.lang.Character;
import java.util.Stack;

public class Balanced {

    static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        boolean bool=false;
        char s[] = {'(','{','}','}'};
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '[' || s[i] == '{' || s[i] == '(') {
                st.push(s[i]);

            }
            if (s[i] == ']' || s[i] == '}' || s[i] == ')') {
                if (st.isEmpty()) {
                    bool= false;
                } else if (!isMatchingPair(st.pop(), s[i])) {
                    bool= false;
                }
            }
        }
        if (st.isEmpty())
            bool =true;
        else {
            bool= false;
        }
        if(bool==true)
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Failure");
        }
    }
}