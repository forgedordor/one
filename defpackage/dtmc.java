package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtmc extends evsn implements evui {
    public static final dtmc a;
    public static final evsl b;
    private static volatile evuo f;
    public int c;
    public long d;
    public long e;

    static {
        dtmc dtmcVar = new dtmc();
        a = dtmcVar;
        evsn.registerDefaultInstance(dtmc.class, dtmcVar);
        b = evsn.newSingularGeneratedExtension(dtlw.a, dtmcVar, dtmcVar, null, 1000, evwh.MESSAGE, dtmc.class);
    }

    private dtmc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dtmc();
        }
        if (iOrdinal == 4) {
            return new dtmb();
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
        synchronized (dtmc.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
