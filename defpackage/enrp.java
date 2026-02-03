package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enrp extends evsn implements evui {
    public static final enrp a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        enrp enrpVar = new enrp();
        a = enrpVar;
        evsn.registerDefaultInstance(enrp.class, enrpVar);
    }

    private enrp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", enrh.class, enro.class});
        }
        if (iOrdinal == 3) {
            return new enrp();
        }
        if (iOrdinal == 4) {
            return new enrd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (enrp.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
