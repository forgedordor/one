package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyyq extends evsn implements evui {
    public static final eyyq a;
    private static volatile evuo e;
    public int b;
    public ezpp c;
    public String d = "";

    static {
        eyyq eyyqVar = new eyyq();
        a = eyyqVar;
        evsn.registerDefaultInstance(eyyq.class, eyyqVar);
    }

    private eyyq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eyyq();
        }
        if (iOrdinal == 4) {
            return new eyyp();
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
        synchronized (eyyq.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
