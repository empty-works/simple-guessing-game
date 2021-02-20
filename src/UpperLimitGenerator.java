public class UpperLimitGenerator {
    int level = 0;
    public UpperLimitGenerator(int level) {
        this.level = level;
    }
    public int getUl() {
        switch(level) {
            case 1: return 10;
            case 2: return 40;
            case 3: return 100;
            default: return 20;
        }
    }
}