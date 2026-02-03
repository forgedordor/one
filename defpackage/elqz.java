package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elqz extends evsn implements evui {
    public static final elqz a;
    private static volatile evuo h;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;

    static {
        elqz elqzVar = new elqz();
        a = elqzVar;
        evsn.registerDefaultInstance(elqz.class, elqzVar);
    }

    private elqz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005᠌\u0004", new Object[]{"b", "c", elqy.a, "d", "e", "f", "g", elqx.a});
        }
        if (iOrdinal == 3) {
            return new elqz();
        }
        if (iOrdinal == 4) {
            return new elqw();
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
        synchronized (elqz.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
