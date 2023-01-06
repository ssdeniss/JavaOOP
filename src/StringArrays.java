public class StringArrays {
    public static void main(String[] args) {
        String[] arr = {"first", "second", "third"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String string : arr) { // forEach
            System.out.println(string);
        }

    }
}
