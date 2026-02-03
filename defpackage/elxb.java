package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elxb extends evsn implements evui {
    public static final elxb a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        elxb elxbVar = new elxb();
        a = elxbVar;
        evsn.registerDefaultInstance(elxb.class, elxbVar);
    }

    private elxb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", elxa.a});
        }
        if (iOrdinal == 3) {
            return new elxb();
        }
        if (iOrdinal == 4) {
            return new elwz();
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
        synchronized (elxb.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
