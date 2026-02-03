package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erww extends evsn implements evui {
    public static final erww a;
    private static volatile evuo h;
    public int b;
    public float c;
    public int d;
    public String e = "";
    public String f = "";
    public boolean g;

    static {
        erww erwwVar = new erww();
        a = erwwVar;
        evsn.registerDefaultInstance(erww.class, erwwVar);
    }

    private erww() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\b\u0006\u0000\u0000\u0000\u0001\u0004\u0003\u0001\u0004\f\u0005Ȉ\u0006Ȉ\b\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new erww();
        }
        if (iOrdinal == 4) {
            return new erwv();
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
        synchronized (erww.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
