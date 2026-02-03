package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqy extends evsn implements evui {
    public static final etqy a;
    private static volatile evuo e;
    public etqo b;
    public etqm c;
    public etqe d;
    private int f;

    static {
        etqy etqyVar = new etqy();
        a = etqyVar;
        evsn.registerDefaultInstance(etqy.class, etqyVar);
    }

    private etqy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new etqy();
        }
        if (iOrdinal == 4) {
            return new etqx();
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
        synchronized (etqy.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
