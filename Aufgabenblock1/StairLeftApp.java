public class StairLeftApp {
    public static void main(String[] args) {
        int nParameters = args.length;
        if (nParameters == 1){
            int n = Integer.parseInt(args[0]);
            for (int i = 1; i <= n; i++) {
                System.out.println("*".repeat(i));
            }
        }
    }
}
