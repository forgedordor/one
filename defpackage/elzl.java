package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elzl extends evsn implements evui {
    public static final elzl a;
    private static volatile evuo d;
    public int b;
    public elzj c;

    static {
        elzl elzlVar = new elzl();
        a = elzlVar;
        evsn.registerDefaultInstance(elzl.class, elzlVar);
    }

    private elzl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new elzl();
        }
        if (iOrdinal == 4) {
            return new elzk();
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
        synchronized (elzl.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
