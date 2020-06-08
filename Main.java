public class Main {
    public static void main(String[] args) {
        float original = 100;
        float add = 1100;
        float limit = 1000;
        float bonus = add/100;
        if (add>limit) {
            System.out.println(bonus);
            return;
        }
        System.out.println(0);
    }
}
