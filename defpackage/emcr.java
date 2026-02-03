package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emcr extends evsn implements evui {
    public static final emcr a;
    private static volatile evuo f;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        emcr emcrVar = new emcr();
        a = emcrVar;
        evsn.registerDefaultInstance(emcr.class, emcrVar);
    }

    private emcr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new emcr();
        }
        if (iOrdinal == 4) {
            return new emcq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emcr.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
