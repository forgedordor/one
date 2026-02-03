package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cchj extends evsn implements evui {
    public static final cchj a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        cchj cchjVar = new cchj();
        a = cchjVar;
        evsn.registerDefaultInstance(cchj.class, cchjVar);
    }

    private cchj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", cchg.a});
        }
        if (iOrdinal == 3) {
            return new cchj();
        }
        if (iOrdinal == 4) {
            return new cchf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cchj.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
