package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eybg extends evsn implements evui {
    public static final eybg a;
    private static volatile evuo d;
    public double b;
    public double c;

    static {
        eybg eybgVar = new eybg();
        a = eybgVar;
        evsn.registerDefaultInstance(eybg.class, eybgVar);
    }

    private eybg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eybg();
        }
        if (iOrdinal == 4) {
            return new eybf();
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
        synchronized (eybg.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
