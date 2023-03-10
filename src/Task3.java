import java.util.Arrays;
import java.util.Scanner;
/*
https://contest.yandex.ru/contest/29188/problems/A/
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);

        int k = scanner.nextInt();
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int b = leftBinSearch(a, l);
            if (b == -1) {
                ans[i] = 0;
                continue;
            }
            int e = rightBinSearch(a, r);
            if (e == -1) {
                ans[i] = 0;
                continue;
            }
            ans[i] = e - b + 1;

        }
        System.out.println(String.join(" ", Arrays.stream(ans)
                .mapToObj(String::valueOf)
                .toArray(String[]::new)));


    }

    private static int leftBinSearch(int[] a, int x) {
        // find first value greater or equal x
        int l = 0;
        if (a[0] >= x)
            return 0;
        int r = a.length - 1;
        if (a[a.length - 1] < x)
            return -1;
        while (r - l != 1) {
            int mid = (r + l) / 2;
            if (a[mid] < x) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return r;
    }

    private static int rightBinSearch(int[] a, int x) {
        // find last value less or equal x
        int l = 0;
        if (a[0] > x)
            return -1;
        int r = a.length - 1;
        if (a[a.length - 1] <= x)
            return a.length - 1;
        while (r - l != 1) {
            int mid = (r + l) / 2;
            if (a[mid] > x) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return l;
    }
}