package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eykm extends evsn implements evui {
    public static final eykm a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        eykm eykmVar = new eykm();
        a = eykmVar;
        evsn.registerDefaultInstance(eykm.class, eykmVar);
    }

    private eykm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", eyle.class, eyla.class});
        }
        if (iOrdinal == 3) {
            return new eykm();
        }
        if (iOrdinal == 4) {
            return new eykl();
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
        synchronized (eykm.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
