package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exmd extends evsn implements evui {
    public static final exmd a;
    private static volatile evuo h;
    public int b;
    public int c;
    public evtg d = emptyProtobufList();
    public exjh e;
    public int f;
    public long g;

    static {
        exmd exmdVar = new exmd();
        a = exmdVar;
        evsn.registerDefaultInstance(exmd.class, exmdVar);
    }

    private exmd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\f\u0005\u0002", new Object[]{"b", "c", "d", exjh.class, "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new exmd();
        }
        if (iOrdinal == 4) {
            return new exmc();
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
        synchronized (exmd.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
