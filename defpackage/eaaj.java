package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaaj extends evsn implements evui {
    public static final eaaj a;
    private static volatile evuo g;
    public long e;
    private int h;
    public evub f = evub.a;
    public String b = "";
    public evqs c = evqs.b;
    public String d = "";

    static {
        eaaj eaajVar = new eaaj();
        a = eaajVar;
        evsn.registerDefaultInstance(eaaj.class, eaajVar);
    }

    private eaaj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"h", "b", "c", "d", "e", "f", eaai.a});
        }
        if (iOrdinal == 3) {
            return new eaaj();
        }
        if (iOrdinal == 4) {
            return new eaah();
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
        synchronized (eaaj.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
