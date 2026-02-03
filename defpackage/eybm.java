package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eybm extends evsn implements evui {
    public static final eybm a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        eybm eybmVar = new eybm();
        a = eybmVar;
        evsn.registerDefaultInstance(eybm.class, eybmVar);
    }

    private eybm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eybm();
        }
        if (iOrdinal == 4) {
            return new eybl();
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
        synchronized (eybm.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
