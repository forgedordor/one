package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clmm extends evsn implements evui {
    public static final clmm a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public boolean d;
    public clnz e;

    static {
        clmm clmmVar = new clmm();
        a = clmmVar;
        evsn.registerDefaultInstance(clmm.class, clmmVar);
    }

    private clmm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new clmm();
        }
        if (iOrdinal == 4) {
            return new clml();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (clmm.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
