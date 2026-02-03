package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnre extends evsn implements evui {
    public static final cnre a;
    private static volatile evuo k;
    public int b;
    public evvp c;
    public evvp d;
    public evvp e;
    public int f;
    public int g;
    public int h;
    public evqs i;
    public evqs j;

    static {
        cnre cnreVar = new cnre();
        a = cnreVar;
        evsn.registerDefaultInstance(cnre.class, cnreVar);
    }

    private cnre() {
        evqs evqsVar = evqs.b;
        this.i = evqsVar;
        this.j = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0004\u0005\u0004\u0006\u0004\u0007\n\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new cnre();
        }
        if (iOrdinal == 4) {
            return new cnrd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cnre.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
