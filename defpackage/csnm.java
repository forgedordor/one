package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csnm extends evsn implements evui {
    public static final csnm a;
    private static volatile evuo c;
    public long b;

    static {
        csnm csnmVar = new csnm();
        a = csnmVar;
        evsn.registerDefaultInstance(csnm.class, csnmVar);
    }

    private csnm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new csnm();
        }
        if (iOrdinal == 4) {
            return new csnl();
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
        synchronized (csnm.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
