package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epsv extends evsn implements evui {
    public static final epsv a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public evqs c = evqs.b;
    private int e;

    static {
        epsv epsvVar = new epsv();
        a = epsvVar;
        evsn.registerDefaultInstance(epsv.class, epsvVar);
    }

    private epsv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new epsv();
        }
        if (iOrdinal == 4) {
            return new epsu();
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
        synchronized (epsv.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
