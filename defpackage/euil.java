package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum euil {
    UNSPECIFIED(0),
    YEAR(1),
    MONTH(2),
    WEEK(3),
    DAY_OF_WEEK(4),
    DAY_OF_MONTH(5),
    HOUR(6),
    MINUTE(7),
    SECOND(8),
    MERIDIEM(9),
    ZONE_OFFSET(10),
    DST_OFFSET(11);

    public static final ekgp m;
    private final int o;

    static {
        ekgi ekgiVar = new ekgi();
        for (euil euilVar : values()) {
            ekgiVar.i(Integer.valueOf(euilVar.o), euilVar);
        }
        m = ekgiVar.c();
    }

    euil(int i) {
        this.o = i;
    }
}
