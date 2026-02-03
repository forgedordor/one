package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoxj extends evsn implements evui {
    public static final eoxj a;
    private static volatile evuo c;
    public String b = "";

    static {
        eoxj eoxjVar = new eoxj();
        a = eoxjVar;
        evsn.registerDefaultInstance(eoxj.class, eoxjVar);
    }

    private eoxj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new eoxj();
        }
        if (iOrdinal == 4) {
            return new eoxi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eoxj.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
