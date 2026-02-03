package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eobx extends evsn implements evui {
    public static final eobx a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public enpl e;

    static {
        eobx eobxVar = new eobx();
        a = eobxVar;
        evsn.registerDefaultInstance(eobx.class, eobxVar);
    }

    private eobx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000", new Object[]{"d", "c", "b", "e", eobz.class});
        }
        if (iOrdinal == 3) {
            return new eobx();
        }
        if (iOrdinal == 4) {
            return new eobw();
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
        synchronized (eobx.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
