import java.util.*;

// code to print
// ***********

public class simple_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            System.out.print('*');
        }
    }
}

// code to print
// *****
// *****
// *****
// *****
class simple_pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}

// code to print
// *****
// ****
// ***
// **
// *

class reverse_tri_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

}

// code to print
// 543210
// 54321
// 5432
// 543
// 54
// 5

class triangle_pattern_with_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.print('\n');
        }
    }

}

// code to print
class reverse_pattern_with_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x = 0; x <= n; x++) {
            for (int y = 1; y <= n - x; y++) {
                System.out.print(y);
            }
            System.out.print('\n');
        }
    }
}

// code to print
// *
// **
// ***
// ****
// *****
class triangle_pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}

// code to print
// B
// BC
// BCD
// BCDE
// BCDEF
class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.format("%c", 65 + j);
            }
            System.out.print('\n');
        }
    }
}

// code to print
// ABCDE
// ABCD
// ABC
// AB
// A
class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.err.format("%c", 64 + j);
            }
            System.out.print('\n');
        }
    }
}

// code to print
// 0
// 10
// 010
// 1010
// 01010
class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i % 2 == 0 & j % 2 != 0) || (i % 2 != 0 & j % 2 == 0)) {
                    System.out.print('1');
                } else {
                    System.out.print('0');
                }
            }
            System.out.print('\n');
        }
    }
}

// code to print
// 1
// 23
// 456
// 78910
// 1112131415
class pattern10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(sum);
                sum++;
            }
            System.out.print('\n');
        }
    }
}

// print a this type of pattern in characters format
// A
// BC
// DEF
// GHIJ
// KLMNO
class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.format("%c", 64 + sum);
                sum++;
            }
            System.out.print('\n');
        }
    }
}

// code to print
// AAAA*
// AAA**
// AA***
// A****
// *****
class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print('A');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}

// code to print
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * * * *
class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.print('\n');
        }
    }
}

// code to print
// ******
// * *
// * *
// * *
// * *
// ******
class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0 || i == n || j == n) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }
}

// code to print
// * *
// ** *
// * * *
// * **
// * *
class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == 5 || i == j) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }
}

// print to this pattern
// *****
// ****A
// ***AA
// **AAA
// *AAAA
// AAAAA
// *AAAA
// **AAA
// ***AA
// ****A
// *****

class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print('*');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('A');
            }
            System.out.print('\n');
        }
        for (int m = 1; m <= n; m++) {
            for (int a = 1; a <= m; a++) {
                System.out.print('*');
            }
            for (int b = 1; b <= n - m; b++) {
                System.out.print('A');
            }
            System.out.print('\n');
        }
    }
}