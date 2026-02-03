package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erjg extends evsn implements evui {
    public static final erjg a;
    private static volatile evuo e;
    public int b;
    public erji c;
    public int d;

    static {
        erjg erjgVar = new erjg();
        a = erjgVar;
        evsn.registerDefaultInstance(erjg.class, erjgVar);
    }

    private erjg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new erjg();
        }
        if (iOrdinal == 4) {
            return new erjf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (erjg.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
