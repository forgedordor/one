package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyfr extends evsn implements evui {
    public static final eyfr a;
    private static volatile evuo f;
    public int b;
    public evqs c = evqs.b;
    public String d = "";
    public boolean e;

    static {
        eyfr eyfrVar = new eyfr();
        a = eyfrVar;
        evsn.registerDefaultInstance(eyfr.class, eyfrVar);
    }

    private eyfr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eyfr();
        }
        if (iOrdinal == 4) {
            return new eyfq();
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
        synchronized (eyfr.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
