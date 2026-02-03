package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum euim {
    UNSPECIFIED(0),
    ABSOLUTE(1),
    RELATIVE(2);

    public static final ekgp d;
    private final int f;

    static {
        ekgi ekgiVar = new ekgi();
        for (euim euimVar : values()) {
            ekgiVar.i(Integer.valueOf(euimVar.f), euimVar);
        }
        d = ekgiVar.c();
    }

    euim(int i) {
        this.f = i;
    }
}
