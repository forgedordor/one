package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezmr extends evsn implements evui {
    public static final ezmr a;
    private static volatile evuo g;
    public int b;
    public ezpp c;
    public ezlj d;
    public int e;
    public String f = "";

    static {
        ezmr ezmrVar = new ezmr();
        a = ezmrVar;
        evsn.registerDefaultInstance(ezmr.class, ezmrVar);
    }

    private ezmr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ezmr();
        }
        if (iOrdinal == 4) {
            return new ezmq();
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
        synchronized (ezmr.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
