package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjmc extends evsn implements evui {
    public static final cjmc a;
    private static volatile evuo b;

    static {
        cjmc cjmcVar = new cjmc();
        a = cjmcVar;
        evsn.registerDefaultInstance(cjmc.class, cjmcVar);
    }

    private cjmc() {
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
            return new cjmc();
        }
        if (iOrdinal == 4) {
            return new cjmb();
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
        synchronized (cjmc.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
