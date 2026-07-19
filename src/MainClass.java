import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int p = 107;
        int q = 101;
        int n = p * q;
        int phi = (p - 1) * (q - 1);

        int e = E(phi);
        long d = D(phi, e);

        System.out.println("enter the text");
        String s = scan.nextLine();

        System.out.println("do you want to encrypt or decrypt");
        String answer = scan.next().toLowerCase();

        if (answer.equals("encrypt")) {
            for (int i = 0; i < s.length(); i++) {
                char c = encrypt(s, e, n, i);
                System.out.print(c);
            }
        }

        if (answer.equals("decrypt")) {
            for (int j = 0; j < s.length(); j++) {
                System.out.print(decrypt(s, d, n, j));
            }
        }
    }

    public static char encrypt(String s, int e, long n, int i) {
        char ch = s.charAt(i);
        int p = convert_char_to_int(ch);
        int z = modulus(p, n, e);
        return (char) z;
    }

    public static char decrypt(String s, long d, long n, int j) {
        int z = modulus(s.charAt(j), n, d);
        return convert_int_to_char(z);
    }

    public static int E(long phi) {
        int e = 0;
        for (int i = 2; i <= phi; i++) {
            if (GCD(phi, i) == 1) {
                e = i;
                break;
            }
        }
        return e;
    }

    public static long D(long phi, long e) {
        long d = 0;
        for (int k = 1; k <= phi; k++) {
            long z = ((k * phi + 1) % (e));
            if (z != 0) {
                continue;
            }
            d = ((k * phi + 1) / e);
            break;
        }
        return d;
    }

    public static int modulus(int c, long n, long power) {
        int temp = 1;
        for (int i = 0; i <= (power - 1); i++) {
            temp *= c;
            temp = (int) (temp % n);
        }
        return temp;
    }

    public static long GCD(long num1, long num2) {
        if ((num1 % num2) == 0) {
            return num2;
        }
        long temp = num2;
        num2 = num1 % temp;
        num1 = temp;
        return GCD(num1, num2);
    }

    public static int convert_char_to_int(char ch) {
        return (int) ch;
    }

    public static char convert_int_to_char(int n) {
        return (char) n;
    }
}