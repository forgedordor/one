package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezoj extends evsn implements evui {
    public static final ezoj a;
    private static volatile evuo e;
    public int d;
    public evub c = evub.a;
    public String b = "";

    static {
        ezoj ezojVar = new ezoj();
        a = ezojVar;
        evsn.registerDefaultInstance(ezoj.class, ezojVar);
    }

    private ezoj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u00022\u0003\f", new Object[]{"b", "c", ezoi.a, "d"});
        }
        if (iOrdinal == 3) {
            return new ezoj();
        }
        if (iOrdinal == 4) {
            return new ezoh();
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
        synchronized (ezoj.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
