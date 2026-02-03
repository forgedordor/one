package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egcx extends evsn implements evui {
    public static final egcx a;
    private static volatile evuo f;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        egcx egcxVar = new egcx();
        a = egcxVar;
        evsn.registerDefaultInstance(egcx.class, egcxVar);
    }

    private egcx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0002\u0003ဂ\u0001", new Object[]{"b", "c", "e", "d"});
        }
        if (iOrdinal == 3) {
            return new egcx();
        }
        if (iOrdinal == 4) {
            return new egcw();
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
        synchronized (egcx.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
