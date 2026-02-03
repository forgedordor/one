package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evpj extends evsn implements evui {
    public static final evpj a;
    private static volatile evuo d;
    public int b;
    public exde c;

    static {
        evpj evpjVar = new evpj();
        a = evpjVar;
        evsn.registerDefaultInstance(evpj.class, evpjVar);
    }

    private evpj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new evpj();
        }
        if (iOrdinal == 4) {
            return new evpi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evpj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
