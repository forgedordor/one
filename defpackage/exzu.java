package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exzu extends evsn implements evui {
    public static final exzu a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public int e;
    public exzm f;

    static {
        exzu exzuVar = new exzu();
        a = exzuVar;
        evsn.registerDefaultInstance(exzu.class, exzuVar);
    }

    private exzu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new exzu();
        }
        if (iOrdinal == 4) {
            return new exzs();
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
        synchronized (exzu.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
