package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsct extends evsn implements evui {
    public static final dsct a;
    private static volatile evuo e;
    public int b;
    public etkl c;
    public int d;

    static {
        dsct dsctVar = new dsct();
        a = dsctVar;
        evsn.registerDefaultInstance(dsct.class, dsctVar);
    }

    private dsct() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dsct();
        }
        if (iOrdinal == 4) {
            return new dscs();
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
        synchronized (dsct.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
