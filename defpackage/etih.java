package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etih extends evsn implements evui {
    public static final etih a;
    private static volatile evuo e;
    public int b;
    public long c;
    public long d;

    static {
        etih etihVar = new etih();
        a = etihVar;
        evsn.registerDefaultInstance(etih.class, etihVar);
    }

    private etih() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new etih();
        }
        if (iOrdinal == 4) {
            return new etig();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etih.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
