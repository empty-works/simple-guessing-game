public class UpperLimitGenerator {
    public static int getUl(int level) {
        switch(level) {
            case 1: return 10;
            case 2: return 40;
            case 3: return 100;
            default: return 20;
        }
    }
}