package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eodc extends evsn implements evui {
    public static final eodc a;
    private static volatile evuo e;
    public int b;
    public int c;
    public boolean d;

    static {
        eodc eodcVar = new eodc();
        a = eodcVar;
        evsn.registerDefaultInstance(eodc.class, eodcVar);
    }

    private eodc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eodc();
        }
        if (iOrdinal == 4) {
            return new eodb();
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
        synchronized (eodc.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
