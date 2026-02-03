package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eahd extends evsn implements evui {
    public static final eahd a;
    private static volatile evuo c;
    public int b;
    private int d;

    static {
        eahd eahdVar = new eahd();
        a = eahdVar;
        evsn.registerDefaultInstance(eahd.class, eahdVar);
    }

    private eahd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new eahd();
        }
        if (iOrdinal == 4) {
            return new eahc();
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
        synchronized (eahd.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
