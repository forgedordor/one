package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethp extends evsn implements evui {
    public static final ethp a;
    private static volatile evuo e;
    public int b;
    public int c;
    public evrj d;

    static {
        ethp ethpVar = new ethp();
        a = ethpVar;
        evsn.registerDefaultInstance(ethp.class, ethpVar);
    }

    private ethp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ethp();
        }
        if (iOrdinal == 4) {
            return new etho();
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
        synchronized (ethp.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
