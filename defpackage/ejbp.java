package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejbp extends evsn implements evui {
    public static final ejbp a;
    private static volatile evuo h;
    public int b;
    public evqs c;
    public evqs d;
    public ejbn e;
    public ejbi f;
    public evqs g;

    static {
        ejbp ejbpVar = new ejbp();
        a = ejbpVar;
        evsn.registerDefaultInstance(ejbp.class, ejbpVar);
    }

    private ejbp() {
        evqs evqsVar = evqs.b;
        this.c = evqsVar;
        this.d = evqsVar;
        this.g = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ည\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ejbp();
        }
        if (iOrdinal == 4) {
            return new ejbo();
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
        synchronized (ejbp.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
