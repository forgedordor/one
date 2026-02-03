package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqmg extends evsn implements evui {
    public static final eqmg a;
    private static volatile evuo e;
    public evtg b = emptyProtobufList();
    public String c = "";
    public int d;

    static {
        eqmg eqmgVar = new eqmg();
        a = eqmgVar;
        evsn.registerDefaultInstance(eqmg.class, eqmgVar);
    }

    private eqmg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0004", new Object[]{"b", eqnl.class, "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eqmg();
        }
        if (iOrdinal == 4) {
            return new eqmf();
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
        synchronized (eqmg.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
