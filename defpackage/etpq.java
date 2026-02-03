package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etpq extends evsn implements evui {
    public static final etpq a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public evtg d = emptyProtobufList();
    public String e = "";
    public etps f;

    static {
        etpq etpqVar = new etpq();
        a = etpqVar;
        evsn.registerDefaultInstance(etpq.class, etpqVar);
    }

    private etpq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0000\u0002Ȉ\u0004\u001b\u0005Ȉ\u0006ဉ\u0000", new Object[]{"b", "c", "d", etqj.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new etpq();
        }
        if (iOrdinal == 4) {
            return new etpp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etpq.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
