public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int arraySum(int[] numbers){
        int sum=0;
        for(int number:numbers){
            sum+=number;
        }
        return sum;
    }
}