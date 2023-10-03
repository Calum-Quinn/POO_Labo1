public class Test {
    public static void main(String[] args) {

        java.util.Random random = new java.util.Random();
        //MAX votes
        int votes = random.nextInt(1000);

        int a = 10;
        int b = 7;
        a -= b;
        System.out.println(votes);
        while (votes != 0) {
            System.out.println(votes);
            votes = random.nextInt(votes);
        }
    }
}
