package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clmr extends evsn implements evui {
    public static final clmr a;
    private static volatile evuo h;
    public int b;
    public clmj c;
    public evtg d = emptyProtobufList();
    public evvp e;
    public clnz f;
    public int g;

    static {
        clmr clmrVar = new clmr();
        a = clmrVar;
        evsn.registerDefaultInstance(clmr.class, clmrVar);
    }

    private clmr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဌ\u0003", new Object[]{"b", "c", "d", clmq.class, "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new clmr();
        }
        if (iOrdinal == 4) {
            return new clmo();
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
        synchronized (clmr.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
