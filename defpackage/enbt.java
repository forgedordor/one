package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enbt extends evsn implements evui {
    public static final enbt a;
    private static volatile evuo e;
    public int b;
    public int c;
    public enbq d;

    static {
        enbt enbtVar = new enbt();
        a = enbtVar;
        evsn.registerDefaultInstance(enbt.class, enbtVar);
    }

    private enbt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0003ဉ\u0001", new Object[]{"b", "c", enbr.a, "d"});
        }
        if (iOrdinal == 3) {
            return new enbt();
        }
        if (iOrdinal == 4) {
            return new enbc();
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
        synchronized (enbt.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
