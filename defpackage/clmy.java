package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clmy extends evsn implements evui {
    public static final clmy a;
    private static volatile evuo g;
    public int b;
    public clmj c;
    public clmu d;
    public evvp e;
    public int f;

    static {
        clmy clmyVar = new clmy();
        a = clmyVar;
        evsn.registerDefaultInstance(clmy.class, clmyVar);
    }

    private clmy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new clmy();
        }
        if (iOrdinal == 4) {
            return new clmx();
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
        synchronized (clmy.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
