package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjke extends evsn implements evui {
    public static final cjke a;
    private static volatile evuo b;

    static {
        cjke cjkeVar = new cjke();
        a = cjkeVar;
        evsn.registerDefaultInstance(cjke.class, cjkeVar);
    }

    private cjke() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new cjke();
        }
        if (iOrdinal == 4) {
            return new cjkd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cjke.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
