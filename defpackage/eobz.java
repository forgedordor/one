package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eobz extends evsn implements evui {
    public static final eobz a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        eobz eobzVar = new eobz();
        a = eobzVar;
        evsn.registerDefaultInstance(eobz.class, eobzVar);
    }

    private eobz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", eock.class, eoch.class, eocn.class});
        }
        if (iOrdinal == 3) {
            return new eobz();
        }
        if (iOrdinal == 4) {
            return new eoby();
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
        synchronized (eobz.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
