public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Run%10d%n", i);
        }

        System.out.println();

        int x = 1;
        while(x<=10){
            System.out.printf("Run%10d%n", x);
            x++;
        }
    }
}
