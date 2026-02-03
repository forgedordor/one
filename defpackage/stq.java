package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stq extends evsn implements evui {
    public static final stq a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        stq stqVar = new stq();
        a = stqVar;
        evsn.registerDefaultInstance(stq.class, stqVar);
    }

    private stq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", stp.a});
        }
        if (iOrdinal == 3) {
            return new stq();
        }
        if (iOrdinal == 4) {
            return new sto();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (stq.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
