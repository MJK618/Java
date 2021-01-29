import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        int sum = 0;
        int num;
        Scanner scanner = new Scanner(System.in);
        int count  = scanner.nextInt();

        for (int i = 1; i <= count; i++){
            num = scanner.nextInt();
            if (num % 6 == 0){
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }
}