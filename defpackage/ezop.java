package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezop extends evsn implements evui {
    public static final ezop a;
    private static volatile evuo e;
    public String b = "";
    public int c;
    public evsp d;
    private int f;

    static {
        ezop ezopVar = new ezop();
        a = ezopVar;
        evsn.registerDefaultInstance(ezop.class, ezopVar);
    }

    private ezop() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ezop();
        }
        if (iOrdinal == 4) {
            return new ezoo();
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
        synchronized (ezop.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
