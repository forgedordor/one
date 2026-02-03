package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etvw extends evsn implements evui {
    public static final etvw a;
    private static volatile evuo d;
    public long b;
    public String c = "";
    private int e;

    static {
        etvw etvwVar = new etvw();
        a = etvwVar;
        evsn.registerDefaultInstance(etvw.class, etvwVar);
    }

    private etvw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new etvw();
        }
        if (iOrdinal == 4) {
            return new etvv();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etvw.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
