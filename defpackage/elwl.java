package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elwl extends evsn implements evui {
    public static final elwl a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        elwl elwlVar = new elwl();
        a = elwlVar;
        evsn.registerDefaultInstance(elwl.class, elwlVar);
    }

    private elwl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", auke.a});
        }
        if (iOrdinal == 3) {
            return new elwl();
        }
        if (iOrdinal == 4) {
            return new elwk();
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
        synchronized (elwl.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
