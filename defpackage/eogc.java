package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogc extends evsn implements evui {
    public static final eogc a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        eogc eogcVar = new eogc();
        a = eogcVar;
        evsn.registerDefaultInstance(eogc.class, eogcVar);
    }

    private eogc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eogc();
        }
        if (iOrdinal == 4) {
            return new eogb();
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
        synchronized (eogc.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
