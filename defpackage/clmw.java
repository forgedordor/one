package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clmw extends evsn implements evui {
    public static final clmw a;
    private static volatile evuo e;
    public int b;
    public clmu c;
    public int d;

    static {
        clmw clmwVar = new clmw();
        a = clmwVar;
        evsn.registerDefaultInstance(clmw.class, clmwVar);
    }

    private clmw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဌ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new clmw();
        }
        if (iOrdinal == 4) {
            return new clmv();
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
        synchronized (clmw.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
