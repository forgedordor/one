package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coow extends evsn implements evui {
    public static final coow a;
    private static volatile evuo f;
    public String b = "";
    public String c = "";
    public String d = "";
    public int e;
    private int g;

    static {
        coow coowVar = new coow();
        a = coowVar;
        evsn.registerDefaultInstance(coow.class, coowVar);
    }

    private coow() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004\f", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new coow();
        }
        if (iOrdinal == 4) {
            return new coou();
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
        synchronized (coow.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
