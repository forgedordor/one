package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asrf {
    private final fcsu a;

    public asrf(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final enyw a() {
        enmr enmrVarD = ((cozg) this.a.b()).d();
        int iOrdinal = enmrVarD.ordinal();
        if (iOrdinal == 0) {
            return enyw.UNKNOWN_RCS_TYPE;
        }
        if (iOrdinal == 1) {
            return enyw.RCS_DUAL_REG;
        }
        if (iOrdinal == 2) {
            return enyw.RCS_TACHYGRAM;
        }
        if (iOrdinal == 3) {
            return enyw.RCS_SINGLE_REG;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(enmrVarD))));
    }
}
