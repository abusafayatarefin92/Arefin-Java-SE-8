
public class GenericSort {

    public static void main(String[] args) {
        Integer[] intArray = {new Integer(2), new Integer(4), new Integer(3)};

        Double[] doubleArray = {new Double(3.4), new Double(1.3), new Double(-22.1)};

        Character[] charArray = {new Character('a'), new Character('j'), new Character('r')};

        String[] stringArray = {"Tom", "Susan", "Kim"};

        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        System.out.println("Sorted integer objects: ");
        printList(intArray);
        System.out.println("Sorted double objects: ");
        printList(doubleArray);
        System.out.println("Sorted character objects: ");
        printList(charArray);
        System.out.println("Sorted string objects: ");
        printList(stringArray);

    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length; i++) {
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void printList(Object[] list) {
        for (Object list1 : list) {
            System.out.print(list1 + " ");
        }
        System.out.println();
    }
}
