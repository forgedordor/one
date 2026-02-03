package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpkr extends evsn<cpkr, cpkq> implements evui {
    public static final cpkr a;
    private static volatile evuo h;
    public int b;
    public cpjr c;
    public crvl d;
    public String e = "";
    public long f;
    public int g;

    static {
        cpkr cpkrVar = new cpkr();
        a = cpkrVar;
        evsn.registerDefaultInstance(cpkr.class, cpkrVar);
    }

    private cpkr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ለ\u0002\u0004ဂ\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new cpkr();
        }
        if (iOrdinal == 4) {
            return new cpkq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cpkr.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
