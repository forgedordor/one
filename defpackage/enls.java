package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enls extends evsn implements evui {
    public static final enls a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        enls enlsVar = new enls();
        a = enlsVar;
        evsn.registerDefaultInstance(enls.class, enlsVar);
    }

    private enls() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004᠌\u0003", new Object[]{"b", "c", enlr.a, "d", enlp.a, "e", enlq.a});
        }
        if (iOrdinal == 3) {
            return new enls();
        }
        if (iOrdinal == 4) {
            return new enlo();
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
        synchronized (enls.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
