package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eliz extends evsn implements evui {
    public static final eliz a;
    private static volatile evuo k;
    public int b;
    public int c;
    public int d;
    public eljf e;
    public eljl f;
    public eljj g;
    public eljd h;
    public eljh i;
    public eljb j;

    static {
        eliz elizVar = new eliz();
        a = elizVar;
        evsn.registerDefaultInstance(eliz.class, elizVar);
    }

    private eliz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"b", "c", elix.a, "d", eliy.a, "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new eliz();
        }
        if (iOrdinal == 4) {
            return new eliw();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eliz.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
