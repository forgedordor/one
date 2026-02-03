package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgqg extends evsn implements evui {
    public static final cgqg a;
    private static volatile evuo d;
    public int b;
    public cgpd c;
    private evub e = evub.a;

    static {
        cgqg cgqgVar = new cgqg();
        a = cgqgVar;
        evsn.registerDefaultInstance(cgqg.class, cgqgVar);
    }

    private cgqg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"b", "c", "e", cgqf.a});
        }
        if (iOrdinal == 3) {
            return new cgqg();
        }
        if (iOrdinal == 4) {
            return new cgqe();
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
        synchronized (cgqg.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
