import java.util.*;

class Leniar {
    public static void main(String args[]) {
        Acc A = new Acc();
        A.search();
    }
}

class Acc {
    void search() {
        Scanner sc = new Scanner(System.in);

        int i, k, n;

        System.out.print("Enter number of elements: ");
        k = sc.nextInt();

        int a[] = new int[k];

        System.out.println("Enter " + k + " elements:");
        for (i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        n = sc.nextInt();

        for (i = 0; i < k; i++) {
            if (a[i] == n) {
                System.out.println("Found at position: " + (i + 1));
                return;
            }
        }

        System.out.println("Element not found");
    }
}