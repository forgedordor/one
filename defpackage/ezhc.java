package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezhc extends evsn implements evui {
    public static final ezhc a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        ezhc ezhcVar = new ezhc();
        a = ezhcVar;
        evsn.registerDefaultInstance(ezhc.class, ezhcVar);
    }

    private ezhc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ezhc();
        }
        if (iOrdinal == 4) {
            return new ezhb();
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
        synchronized (ezhc.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
