package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enqw extends evsn implements evui {
    public static final enqw a;
    private static volatile evuo g;
    public int b;
    public Object d;
    public int c = 0;
    public evqs e = evqs.b;
    public evsx f = emptyIntList();

    static {
        enqw enqwVar = new enqw();
        a = enqwVar;
        evsn.registerDefaultInstance(enqw.class, enqwVar);
    }

    private enqw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ည\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007ࠞ\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"d", "c", "b", "e", enqr.class, enqd.class, enpt.class, enpr.class, enqa.class, "f", enql.a, enpy.class, enqk.class, enqv.class, enqh.class, enqt.class, enqf.class, enpw.class});
        }
        if (iOrdinal == 3) {
            return new enqw();
        }
        if (iOrdinal == 4) {
            return new enpu();
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
        synchronized (enqw.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
