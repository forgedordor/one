package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enaq extends evsn implements evui {
    public static final enaq a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        enaq enaqVar = new enaq();
        a = enaqVar;
        evsn.registerDefaultInstance(enaq.class, enaqVar);
    }

    private enaq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002\u083f\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", enao.class, enap.a, evrl.class, evrl.class, enaa.class});
        }
        if (iOrdinal == 3) {
            return new enaq();
        }
        if (iOrdinal == 4) {
            return new enab();
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
        synchronized (enaq.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
