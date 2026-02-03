package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exoi extends evsn implements evui {
    public static final evsy a = new exod();
    public static final exoi b;
    private static volatile evuo g;
    public int c;
    public exog d;
    public int e;
    public evsx f = emptyIntList();

    static {
        exoi exoiVar = new exoi();
        b = exoiVar;
        evsn.registerDefaultInstance(exoi.class, exoiVar);
    }

    private exoi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0003\f\u0004,", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new exoi();
        }
        if (iOrdinal == 4) {
            return new exoe();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exoi.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
