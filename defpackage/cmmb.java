package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmmb extends evsn implements evui {
    public static final cmmb a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        cmmb cmmbVar = new cmmb();
        a = cmmbVar;
        evsn.registerDefaultInstance(cmmb.class, cmmbVar);
    }

    private cmmb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002\u0005ለ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new cmmb();
        }
        if (iOrdinal == 4) {
            return new cmma();
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
        synchronized (cmmb.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
