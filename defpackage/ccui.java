package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccui extends evsn implements evui {
    public static final ccui a;
    private static volatile evuo d;
    public int b;
    public ccps c;

    static {
        ccui ccuiVar = new ccui();
        a = ccuiVar;
        evsn.registerDefaultInstance(ccui.class, ccuiVar);
    }

    private ccui() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ccui();
        }
        if (iOrdinal == 4) {
            return new ccuh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ccui.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
