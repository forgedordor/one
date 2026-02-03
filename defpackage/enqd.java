package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enqd extends evsn implements evui {
    public static final enqd a;
    private static volatile evuo f;
    public int b;
    public evqs c = evqs.b;
    public long d;
    public int e;

    static {
        enqd enqdVar = new enqd();
        a = enqdVar;
        evsn.registerDefaultInstance(enqd.class, enqdVar);
    }

    private enqd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", enqc.a});
        }
        if (iOrdinal == 3) {
            return new enqd();
        }
        if (iOrdinal == 4) {
            return new enqb();
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
        synchronized (enqd.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
