import java.util.Scanner;
import java.util.Stack;
/*
https://contest.yandex.ru/contest/45468/problems/12/
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char c :line.toCharArray()){
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                if (stack.empty()) {
                    System.out.println("no");
                    return;
                }
                char pre = stack.pop();
                if ((c == ')' && pre == '(') ||
                        (c == ']' && pre == '[') ||
                        (c == '}' && pre == '{') ){

                }
                else {
                    System.out.println("no");
                    return;
                }

            }
        }
        if (stack.empty()) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
