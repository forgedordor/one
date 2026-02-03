package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evkc extends evsn implements evui {
    public static final evkc a;
    private static volatile evuo h;
    public int b;
    public boolean c;
    public boolean d;
    public evsx e = emptyIntList();
    public boolean f;
    public boolean g;

    static {
        evkc evkcVar = new evkc();
        a = evkcVar;
        evsn.registerDefaultInstance(evkc.class, evkcVar);
    }

    private evkc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0006\u000f\u0005\u0000\u0001\u0000\u0006ဇ\u0005\tဇ\b\u000bࠬ\rဇ\u000b\u000fဇ\r", new Object[]{"b", "c", "d", "e", eviz.a, "f", "g"});
        }
        if (iOrdinal == 3) {
            return new evkc();
        }
        if (iOrdinal == 4) {
            return new evkb();
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
        synchronized (evkc.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
