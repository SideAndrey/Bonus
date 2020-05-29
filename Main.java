public class Main {
    public static void main(String[] args) {
        float original = 900;
        float add = 1100;
        float bonus = (original + add + (add/100)) ;

         if (add < 1000)
            { bonus = original + add;}
         System.out.println(bonus);
    }
}
