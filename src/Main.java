public class Main {
    public static void main(String[] args) {
        double[] list = {12.0, 6.0, 1.0, 29.0, 62.0};

        double total = 0.0, average;
        for (int i = 0; i < list.length; i++){
            total += list[i];
        }
        average = total / list.length;
        System.out.println(average);
    }
}