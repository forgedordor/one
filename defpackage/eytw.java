package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eytw extends evsn implements evui {
    public static final eytw a;
    private static volatile evuo e;
    public evtg b = emptyProtobufList();
    public int c;
    public int d;

    static {
        eytw eytwVar = new eytw();
        a = eytwVar;
        evsn.registerDefaultInstance(eytw.class, eytwVar);
    }

    private eytw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003\f", new Object[]{"b", eytu.class, "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eytw();
        }
        if (iOrdinal == 4) {
            return new eytv();
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
        synchronized (eytw.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
