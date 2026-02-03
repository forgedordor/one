package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exbw extends evsn implements evui {
    public static final exbw a;
    private static volatile evuo g;
    public int b;
    public int c = 0;
    public Object d;
    public evpc e;
    public boolean f;

    static {
        exbw exbwVar = new exbw();
        a = exbwVar;
        evsn.registerDefaultInstance(exbw.class, exbwVar);
    }

    private exbw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002:\u0000\u0003ဉ\u0000\u0004ဇ\u0001", new Object[]{"d", "c", "b", exci.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new exbw();
        }
        if (iOrdinal == 4) {
            return new exbv();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exbw.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
