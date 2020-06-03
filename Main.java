public class Main {
    public static void main(String[] args) {
        float original = 900;
        float add = 1100;
        float bonus = add/100;
        if (add < 1000)
        {bonus = add/100;}
        float total = original + add + bonus;

        System.out.println(bonus);
        System.out.println(total);
    }
}
