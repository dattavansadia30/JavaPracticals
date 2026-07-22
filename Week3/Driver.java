
public class Driver {
    public static void main(String[] args) {

        Point[] arr = {
            new Point(1, 2),
            new Point(2, 3),
            new Point(1, 2),
            new Point(4, 5),
            new Point(2, 3),
            new Point(6, 7)
        };

        int distinct = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean seen = false;

            for (int j = 0; j < i; j++) {
                if (arr[i].equals(arr[j])) {
                    seen = true;
                    break;
                }
            }

            if (!seen) {
                distinct++;
            }
        }

        System.out.println("Distinct: " + distinct);
    }
}