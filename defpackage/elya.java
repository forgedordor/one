package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elya extends evsn implements evui {
    public static final elya a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public int d;
    public int e;

    static {
        elya elyaVar = new elya();
        a = elyaVar;
        evsn.registerDefaultInstance(elya.class, elyaVar);
    }

    private elya() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"b", "c", "d", elxy.a, "e"});
        }
        if (iOrdinal == 3) {
            return new elya();
        }
        if (iOrdinal == 4) {
            return new elxx();
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
        synchronized (elya.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
