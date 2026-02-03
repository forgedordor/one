package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezkl extends evsn implements evui {
    public static final ezkl a;
    private static volatile evuo e;
    public int b;
    public ezpp c;
    public ezjz d;
    private ezll f;

    static {
        ezkl ezklVar = new ezkl();
        a = ezklVar;
        evsn.registerDefaultInstance(ezkl.class, ezklVar);
    }

    private ezkl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "f", "d"});
        }
        if (iOrdinal == 3) {
            return new ezkl();
        }
        if (iOrdinal == 4) {
            return new ezkk();
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
        synchronized (ezkl.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
