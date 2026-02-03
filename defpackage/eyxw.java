package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyxw extends evsn implements evui {
    public static final eyxw a;
    private static volatile evuo e;
    public evqs b;
    public evqs c;
    public evqs d;

    static {
        eyxw eyxwVar = new eyxw();
        a = eyxwVar;
        evsn.registerDefaultInstance(eyxw.class, eyxwVar);
    }

    private eyxw() {
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
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eyxw();
        }
        if (iOrdinal == 4) {
            return new eyxv();
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
        synchronized (eyxw.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
