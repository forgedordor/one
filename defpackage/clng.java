package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clng extends evsn implements evui {
    public static final clng a;
    private static volatile evuo g;
    public int b;
    public int c = 0;
    public Object d;
    public clmj e;
    public evvp f;

    static {
        clng clngVar = new clng();
        a = clngVar;
        evsn.registerDefaultInstance(clng.class, clngVar);
    }

    private clng() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003ဉ\u0001", new Object[]{"d", "c", "b", "e", clmm.class, "f"});
        }
        if (iOrdinal == 3) {
            return new clng();
        }
        if (iOrdinal == 4) {
            return new clnf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (clng.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
