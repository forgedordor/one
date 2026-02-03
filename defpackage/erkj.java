package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erkj extends evsn implements evui {
    public static final erkj a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        erkj erkjVar = new erkj();
        a = erkjVar;
        evsn.registerDefaultInstance(erkj.class, erkjVar);
    }

    private erkj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new erkj();
        }
        if (iOrdinal == 4) {
            return new erki();
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
        synchronized (erkj.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
