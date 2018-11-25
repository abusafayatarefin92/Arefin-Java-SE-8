
public class ArrayCopy {

    public static void main(String[] args) {
        int sourceArray[] = {1, 6, 8, 5};
        int targetArray[] = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }

        for (int j : targetArray) {
            System.out.print(j + " ");
        }

        System.out.println();

        int newArray[] = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, newArray, 0, sourceArray.length);

        for (int k : newArray) {
            System.out.print(k + " ");
        }

        System.out.println();

        int s[] = {1, 3, 5, 7};
        int t[] = new int[10];

        System.arraycopy(s, 1, t, 7, 3);

        for (int p : t) {
            System.out.print(p + " ");
        }

    }

}
