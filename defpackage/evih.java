package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evih extends evsn implements evui {
    public static final evih a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public evjx d;
    public evjg e;
    public evkh f;
    public evju g;

    static {
        evih evihVar = new evih();
        a = evihVar;
        evsn.registerDefaultInstance(evih.class, evihVar);
    }

    private evih() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0001\u0007ဉ\u0004", new Object[]{"b", "c", "e", "f", "d", "g"});
        }
        if (iOrdinal == 3) {
            return new evih();
        }
        if (iOrdinal == 4) {
            return new evig();
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
        synchronized (evih.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
