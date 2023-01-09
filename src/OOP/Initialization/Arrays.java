package OOP.Initialization;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[][] numbers = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.println("numbers[" + i + "] = " + arr[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println("numbers[" + i + "][" + j + "]");
            }
        }
    }
}
