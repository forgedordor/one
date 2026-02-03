package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erng extends evsn implements evui {
    public static final erng a;
    private static volatile evuo k;
    public int b;
    public int c;
    public erni d;
    public evqs e;
    public evqs f;
    public evqs g;
    public evqs h;
    public evqs i;
    public evqs j;

    static {
        erng erngVar = new erng();
        a = erngVar;
        evsn.registerDefaultInstance(erng.class, erngVar);
    }

    private erng() {
        evqs evqsVar = evqs.b;
        this.e = evqsVar;
        this.f = evqsVar;
        this.g = evqsVar;
        this.h = evqsVar;
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
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new erng();
        }
        if (iOrdinal == 4) {
            return new ernf();
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
        synchronized (erng.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
