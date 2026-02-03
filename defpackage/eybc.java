package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eybc extends evsn implements evui {
    public static final eybc a;
    private static volatile evuo k;
    public int b = 0;
    public Object c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        eybc eybcVar = new eybc();
        a = eybcVar;
        evsn.registerDefaultInstance(eybc.class, eybcVar);
    }

    private eybc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"c", "b", "d", "e", "f", "g", "h", "i", "j", evrj.class, eybo.class});
        }
        if (iOrdinal == 3) {
            return new eybc();
        }
        if (iOrdinal == 4) {
            return new eyba();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eybc.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
