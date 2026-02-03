package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqny extends evsn implements evui {
    public static final eqny a;
    private static volatile evuo h;
    public int b;
    public eqjl c;
    public eqjq e;
    public int f;
    public String d = "";
    public evsx g = emptyIntList();

    static {
        eqny eqnyVar = new eqny();
        a = eqnyVar;
        evsn.registerDefaultInstance(eqny.class, eqnyVar);
    }

    private eqny() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0005\f\u0006,", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new eqny();
        }
        if (iOrdinal == 4) {
            return new eqnw();
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
        synchronized (eqny.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
