package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eahp extends evsn implements evui {
    public static final eahp a;
    private static volatile evuo d;
    public int b;
    public String c = "";

    static {
        eahp eahpVar = new eahp();
        a = eahpVar;
        evsn.registerDefaultInstance(eahp.class, eahpVar);
    }

    private eahp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eahp();
        }
        if (iOrdinal == 4) {
            return new eaho();
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
        synchronized (eahp.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
