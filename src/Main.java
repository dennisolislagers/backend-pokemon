public class Main {
    public static void main(String[] args) {
//        We maken de objecten aan:
        Fighting machop = new Fighting("Machop", "neutral", 66, 0.8, 19.5, "Stomagepunch", "Rocky Balboa", 12, true);
        Fighting machoke = new Fighting("Machoke", "neutral", 67, 1.5, 70.5, "headpunch", "Drago", 45, false);

        machop.weakness();
        machop.stelVoor("Machop", "neutraal", 66, 0.8, 19.5);
        machop.fighterIsMean();
        machoke.weakness();
        machoke.stelVoor("Machoke", "neutraal", 67, 0.8, 70.5);
        machoke.fighterIsMean();
    }
}
