package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ensg extends evsn implements evui {
    public static final ensg a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        ensg ensgVar = new ensg();
        a = ensgVar;
        evsn.registerDefaultInstance(ensg.class, ensgVar);
    }

    private ensg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", ensc.class});
        }
        if (iOrdinal == 3) {
            return new ensg();
        }
        if (iOrdinal == 4) {
            return new ensf();
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
        synchronized (ensg.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
