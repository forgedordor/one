package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evif extends evsn implements evui {
    public static final evif a;
    private static volatile evuo e;
    public Object c;
    private int f;
    public int b = 0;
    public evqs d = evqs.b;

    static {
        evif evifVar = new evif();
        a = evifVar;
        evsn.registerDefaultInstance(evif.class, evifVar);
    }

    private evif() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002ည\u0000\u0003=\u0000", new Object[]{"c", "b", "f", evih.class, "d"});
        }
        if (iOrdinal == 3) {
            return new evif();
        }
        if (iOrdinal == 4) {
            return new evie();
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
        synchronized (evif.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
