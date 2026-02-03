package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ernq extends evsn implements evui {
    public static final ernq a;
    private static volatile evuo g;
    public int b;
    public int c;
    public ernm d;
    public evqs e;
    public evqs f;

    static {
        ernq ernqVar = new ernq();
        a = ernqVar;
        evsn.registerDefaultInstance(ernq.class, ernqVar);
    }

    private ernq() {
        evqs evqsVar = evqs.b;
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
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ernq();
        }
        if (iOrdinal == 4) {
            return new ernp();
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
        synchronized (ernq.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
