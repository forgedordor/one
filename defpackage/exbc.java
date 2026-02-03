package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exbc extends evsn implements evui {
    public static final exbc a;
    private static volatile evuo e;
    public int b;
    public double c;
    public double d;

    static {
        exbc exbcVar = new exbc();
        a = exbcVar;
        evsn.registerDefaultInstance(exbc.class, exbcVar);
    }

    private exbc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new exbc();
        }
        if (iOrdinal == 4) {
            return new exbb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exbc.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
