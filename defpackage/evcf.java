package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evcf extends evsn implements evui {
    public static final evcf a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;

    static {
        evcf evcfVar = new evcf();
        a = evcfVar;
        evsn.registerDefaultInstance(evcf.class, evcfVar);
    }

    private evcf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", evcd.a, "f", evcb.a});
        }
        if (iOrdinal == 3) {
            return new evcf();
        }
        if (iOrdinal == 4) {
            return new evca();
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
        synchronized (evcf.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
