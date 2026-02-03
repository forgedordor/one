package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class encs extends evsn implements evui {
    public static final encs a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        encs encsVar = new encs();
        a = encsVar;
        evsn.registerDefaultInstance(encs.class, encsVar);
    }

    private encs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", encp.a, "d", encq.a, "e", encr.a});
        }
        if (iOrdinal == 3) {
            return new encs();
        }
        if (iOrdinal == 4) {
            return new enco();
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
        synchronized (encs.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
