import java.util.HashSet;
import java.util.Scanner;
// jenom ja a buh vime jak ten code funguje
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> lahvicky = new HashSet<>();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            if (t == 2) {
                lahvicky.remove(x);
                continue;
            }boolean muze = !lahvicky.contains(x);
            for (int cislo : lahvicky) {
                if (nsd(x, cislo) > 1) {
                    muze = false;
                    break;
                }}if (muze) {
                lahvicky.add(x);
                System.out.println("ANO");
            } else {
                System.out.println("NE");}}}

    private static int nsd(int a, int b) {
        while (b != 0) {
            int zbytek = a % b;
            a = b;
            b = zbytek;
        }return a;}
}