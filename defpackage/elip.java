package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elip extends evsn implements evui {
    public static final elip a;
    private static volatile evuo h;
    public int b;
    public elsh c;
    public elsp d;
    public elts e;
    public elqj f;
    public elld g;

    static {
        elip elipVar = new elip();
        a = elipVar;
        evsn.registerDefaultInstance(elip.class, elipVar);
    }

    private elip() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new elip();
        }
        if (iOrdinal == 4) {
            return new elio();
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
        synchronized (elip.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
