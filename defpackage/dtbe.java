package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbe extends evsn implements evui {
    public static final dtbe a;
    private static volatile evuo e;
    public int b;
    public int c = 250;
    public dtaz d;
    private int f;

    static {
        dtbe dtbeVar = new dtbe();
        a = dtbeVar;
        evsn.registerDefaultInstance(dtbe.class, dtbeVar);
    }

    private dtbe() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"f", "b", dtbc.a, "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dtbe();
        }
        if (iOrdinal == 4) {
            return new dtbb();
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
        synchronized (dtbe.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
