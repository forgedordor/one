package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emcp extends evsn implements evui {
    public static final emcp a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e = 22;

    static {
        emcp emcpVar = new emcp();
        a = emcpVar;
        evsn.registerDefaultInstance(emcp.class, emcpVar);
    }

    private emcp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", emcl.a, "d", emdg.a, "e", emcm.a});
        }
        if (iOrdinal == 3) {
            return new emcp();
        }
        if (iOrdinal == 4) {
            return new emco();
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
        synchronized (emcp.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
