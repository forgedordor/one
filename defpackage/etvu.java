package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etvu extends evsn implements evui {
    public static final etvu a;
    private static volatile evuo f;
    public String b = "";
    public String c = "";
    public String d = "";
    public long e;
    private int g;

    static {
        etvu etvuVar = new etvu();
        a = etvuVar;
        evsn.registerDefaultInstance(etvu.class, etvuVar);
    }

    private etvu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new etvu();
        }
        if (iOrdinal == 4) {
            return new etvt();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etvu.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
