package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoxa extends evsn implements evui {
    public static final eoxa a;
    private static volatile evuo c;
    public int b;

    static {
        eoxa eoxaVar = new eoxa();
        a = eoxaVar;
        evsn.registerDefaultInstance(eoxa.class, eoxaVar);
    }

    private eoxa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new eoxa();
        }
        if (iOrdinal == 4) {
            return new eowz();
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
        synchronized (eoxa.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
