package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum euio {
    UNKNOWN(-1),
    YEAR(0),
    MONTH(1),
    WEEK(2),
    DAY(3),
    HOUR(4),
    MINUTE(5),
    SECOND(6);

    private static final ekgp j;
    public final int i;

    static {
        ekgi ekgiVar = new ekgi();
        for (euio euioVar : values()) {
            ekgiVar.i(Integer.valueOf(euioVar.i), euioVar);
        }
        j = ekgiVar.c();
    }

    euio(int i) {
        this.i = i;
    }

    public static euio a(int i) {
        ekgp ekgpVar = j;
        Integer numValueOf = Integer.valueOf(i);
        ejwl.d(ekgpVar.containsKey(numValueOf), "Unknown datetime granularity value: %s", i);
        return (euio) ekgpVar.get(numValueOf);
    }
}
