package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euwv extends evsn implements evui {
    public static final euwv a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        euwv euwvVar = new euwv();
        a = euwvVar;
        evsn.registerDefaultInstance(euwv.class, euwvVar);
    }

    private euwv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", euwt.class});
        }
        if (iOrdinal == 3) {
            return new euwv();
        }
        if (iOrdinal == 4) {
            return new euwu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (euwv.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
