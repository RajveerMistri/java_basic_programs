import java.util.Scanner;

class Stud {
    int marks[] = new int[3];

    Stud(int m1, int m2, int m3) {
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    void total() {
        System.out.println("Total = " + (marks[0] + marks[1] + marks[2]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stud s[] = new Stud[2];

        for (int i = 0; i < 2; i++) {
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            s[i] = new Stud(m1, m2, m3);
        }

        for (Stud x : s)
            x.total();
    }
}
