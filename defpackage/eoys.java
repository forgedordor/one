package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoys extends evsn implements evui {
    public static final eoys a;
    private static volatile evuo f;
    public evtg b = emptyProtobufList();
    public String c = "";
    public boolean d;
    public epes e;
    private int g;

    static {
        eoys eoysVar = new eoys();
        a = eoysVar;
        evsn.registerDefaultInstance(eoys.class, eoysVar);
    }

    private eoys() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002\u001b\u0003Ȉ\u0004\u0007\u0005ဉ\u0000", new Object[]{"g", "b", eowf.class, "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eoys();
        }
        if (iOrdinal == 4) {
            return new eoyr();
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
        synchronized (eoys.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
