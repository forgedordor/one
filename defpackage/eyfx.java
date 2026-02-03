package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyfx extends evsn implements evui {
    public static final eyfx a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public String d = "";
    public evqs e = evqs.b;
    public eyga f;

    static {
        eyfx eyfxVar = new eyfx();
        a = eyfxVar;
        evsn.registerDefaultInstance(eyfx.class, eyfxVar);
    }

    private eyfx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eyfx();
        }
        if (iOrdinal == 4) {
            return new eyfw();
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
        synchronized (eyfx.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
