package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyye extends evsn implements evui {
    public static final eyye a;
    private static volatile evuo g;
    public evqs b;
    public evqs c;
    public evqs d;
    public evqs e;
    public evqs f;

    static {
        eyye eyyeVar = new eyye();
        a = eyyeVar;
        evsn.registerDefaultInstance(eyye.class, eyyeVar);
    }

    private eyye() {
        evqs evqsVar = evqs.b;
        this.b = evqsVar;
        this.c = evqsVar;
        this.d = evqsVar;
        this.e = evqsVar;
        this.f = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\n\u0005\n", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eyye();
        }
        if (iOrdinal == 4) {
            return new eyyd();
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
        synchronized (eyye.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
