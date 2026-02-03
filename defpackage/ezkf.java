package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezkf extends evsn implements evui {
    public static final ezkf a;
    private static volatile evuo d;
    public int b;
    public ezpp c;

    static {
        ezkf ezkfVar = new ezkf();
        a = ezkfVar;
        evsn.registerDefaultInstance(ezkf.class, ezkfVar);
    }

    private ezkf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezkf();
        }
        if (iOrdinal == 4) {
            return new ezke();
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
        synchronized (ezkf.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
