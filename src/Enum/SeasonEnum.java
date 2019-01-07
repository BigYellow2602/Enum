package Enum;

public enum SeasonEnum {
    春(1),
    夏(2),
    秋(3),
    冬(4);

    private int k;

    private SeasonEnum(int k) {
        this.k = k;
    }

    public int getK() {
        return k;
    }


    public static SeasonEnum select(int k) {
        for (SeasonEnum se : SeasonEnum.values()) {
            if (se.getK() == k) {
                return se;
            }
        }
        
    }
}
