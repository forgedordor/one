package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyya extends evsn implements evui {
    public static final dyya a;
    private static volatile evuo d;
    public int b;
    public emmo c;

    static {
        dyya dyyaVar = new dyya();
        a = dyyaVar;
        evsn.registerDefaultInstance(dyya.class, dyyaVar);
    }

    private dyya() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dyya();
        }
        if (iOrdinal == 4) {
            return new dyxz();
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
        synchronized (dyya.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
