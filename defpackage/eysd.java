package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eysd extends evsn implements evui {
    public static final eysd a;
    private static volatile evuo e;
    public Object c;
    public int b = 0;
    public evqs d = evqs.b;

    static {
        eysd eysdVar = new eysd();
        a = eysdVar;
        evsn.registerDefaultInstance(eysd.class, eysdVar);
    }

    private eysd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0002\u000b\u0003\u0000\u0000\u0000\u0002\n\n<\u0000\u000bȻ\u0000", new Object[]{"c", "b", "d", ezop.class});
        }
        if (iOrdinal == 3) {
            return new eysd();
        }
        if (iOrdinal == 4) {
            return new eysc();
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
        synchronized (eysd.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
