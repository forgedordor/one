package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eplb extends evsn implements evui {
    public static final eplb a;
    private static volatile evuo e;
    public double b;
    public double c;
    public String d = "";

    static {
        eplb eplbVar = new eplb();
        a = eplbVar;
        evsn.registerDefaultInstance(eplb.class, eplbVar);
    }

    private eplb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eplb();
        }
        if (iOrdinal == 4) {
            return new epla();
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
        synchronized (eplb.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
