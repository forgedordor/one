package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyxm extends evsn implements evui {
    public static final eyxm a;
    private static volatile evuo e;
    public evqs b;
    public evqs c;
    public evqs d;

    static {
        eyxm eyxmVar = new eyxm();
        a = eyxmVar;
        evsn.registerDefaultInstance(eyxm.class, eyxmVar);
    }

    private eyxm() {
        evqs evqsVar = evqs.b;
        this.b = evqsVar;
        this.c = evqsVar;
        this.d = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\n\u0003\n\u0004\n", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eyxm();
        }
        if (iOrdinal == 4) {
            return new eyxl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eyxm.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
