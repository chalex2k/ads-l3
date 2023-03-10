import java.util.Scanner;

/*
https://contest.yandex.ru/contest/29075/problems/B/
Алгоритм Кадане
В общем случае 2 указателя
http://e-maxx.ru/algo/maximum_average_segment
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int maxS = 0;
        int s = 0;
        for (int v:a) {
            s += v;
            s = Math.max(s, 0);
            maxS = Math.max(maxS, s);
        }
        System.out.println(maxS);
    }
}
