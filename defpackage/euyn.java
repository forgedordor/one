package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euyn extends evsn implements evui {
    public static final euyn a;
    private static volatile evuo f;
    public int b;
    public euwv c;
    public int d;
    public String e = "";

    static {
        euyn euynVar = new euyn();
        a = euynVar;
        evsn.registerDefaultInstance(euyn.class, euynVar);
    }

    private euyn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဉ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (iOrdinal == 3) {
            return new euyn();
        }
        if (iOrdinal == 4) {
            return new euym();
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
        synchronized (euyn.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
