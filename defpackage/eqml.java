package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqml extends evsn implements evui {
    public static final eqml a;
    private static volatile evuo h;
    public int b;
    public evvp c;
    public int d;
    public int e;
    public eqmw f;
    public evtg g = emptyProtobufList();

    static {
        eqml eqmlVar = new eqml();
        a = eqmlVar;
        evsn.registerDefaultInstance(eqml.class, eqmlVar);
    }

    private eqml() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\f\u0003\f\u0004ဉ\u0001\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", eqmw.class});
        }
        if (iOrdinal == 3) {
            return new eqml();
        }
        if (iOrdinal == 4) {
            return new eqmk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eqml.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
