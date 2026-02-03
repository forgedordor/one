package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enqk extends evsn implements evui {
    public static final enqk a;
    private static volatile evuo g;
    public int b;
    public evqs c = evqs.b;
    public boolean d;
    public boolean e;
    public int f;

    static {
        enqk enqkVar = new enqk();
        a = enqkVar;
        evsn.registerDefaultInstance(enqk.class, enqkVar);
    }

    private enqk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", enqj.a});
        }
        if (iOrdinal == 3) {
            return new enqk();
        }
        if (iOrdinal == 4) {
            return new enqi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enqk.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
