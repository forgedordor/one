package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxsm extends evsn implements evui {
    public static final bxsm a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        bxsm bxsmVar = new bxsm();
        a = bxsmVar;
        evsn.registerDefaultInstance(bxsm.class, bxsmVar);
    }

    private bxsm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = bxsk.a;
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", evsvVar, "d", evsvVar});
        }
        if (iOrdinal == 3) {
            return new bxsm();
        }
        if (iOrdinal == 4) {
            return new bxsj();
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
        synchronized (bxsm.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
