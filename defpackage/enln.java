package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enln extends evsn implements evui {
    public static final enln a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        enln enlnVar = new enln();
        a = enlnVar;
        evsn.registerDefaultInstance(enln.class, enlnVar);
    }

    private enln() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", enlm.a, "d", dqcu.a});
        }
        if (iOrdinal == 3) {
            return new enln();
        }
        if (iOrdinal == 4) {
            return new enll();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enln.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
