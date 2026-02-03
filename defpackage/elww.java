package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elww extends evsn implements evui {
    public static final elww a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        elww elwwVar = new elww();
        a = elwwVar;
        evsn.registerDefaultInstance(elww.class, elwwVar);
    }

    private elww() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", elxg.a});
        }
        if (iOrdinal == 3) {
            return new elww();
        }
        if (iOrdinal == 4) {
            return new elwv();
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
        synchronized (elww.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
