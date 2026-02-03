package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezts extends evsn implements evui {
    public static final ezts a;
    private static volatile evuo e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        ezts eztsVar = new ezts();
        a = eztsVar;
        evsn.registerDefaultInstance(ezts.class, eztsVar);
    }

    private ezts() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", "d", ezta.class, eztr.class});
        }
        if (iOrdinal == 3) {
            return new ezts();
        }
        if (iOrdinal == 4) {
            return new eztp();
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
        synchronized (ezts.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
