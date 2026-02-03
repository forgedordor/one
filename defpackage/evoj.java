package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evoj extends evsn implements evui {
    public static final evoj a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        evoj evojVar = new evoj();
        a = evojVar;
        evsn.registerDefaultInstance(evoj.class, evojVar);
    }

    private evoj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002;\u0000\u0003\u083f\u0000\u00047\u0000\u0005:\u0000", new Object[]{"d", "c", "b", "e", evog.a});
        }
        if (iOrdinal == 3) {
            return new evoj();
        }
        if (iOrdinal == 4) {
            return new evof();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evoj.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
