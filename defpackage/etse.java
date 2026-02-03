package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etse extends evsn implements evui {
    public static final etse a;
    private static volatile evuo h;
    public int b;
    public int d;
    public etsl e;
    public etto f;
    public String c = "";
    public evtg g = emptyProtobufList();

    static {
        etse etseVar = new etse();
        a = etseVar;
        evsn.registerDefaultInstance(etse.class, etseVar);
    }

    private etse() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", etsa.class});
        }
        if (iOrdinal == 3) {
            return new etse();
        }
        if (iOrdinal == 4) {
            return new etsd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etse.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
