package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etkr extends evsn implements evui {
    public static final etkr a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;

    static {
        etkr etkrVar = new etkr();
        a = etkrVar;
        evsn.registerDefaultInstance(etkr.class, etkrVar);
    }

    private etkr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", etlc.class, etkj.class, etmo.class, etkd.class});
        }
        if (iOrdinal == 3) {
            return new etkr();
        }
        if (iOrdinal == 4) {
            return new etkp();
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
        synchronized (etkr.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
