package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwc extends evsn implements evui {
    public static final epwc a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public String d = "";
    public epvy e;

    static {
        epwc epwcVar = new epwc();
        a = epwcVar;
        evsn.registerDefaultInstance(epwc.class, epwcVar);
    }

    private epwc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new epwc();
        }
        if (iOrdinal == 4) {
            return new epwb();
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
        synchronized (epwc.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
