package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezcp extends evsn implements evui {
    public static final ezcp a;
    private static volatile evuo c;
    public String b = "";

    static {
        ezcp ezcpVar = new ezcp();
        a = ezcpVar;
        evsn.registerDefaultInstance(ezcp.class, ezcpVar);
    }

    private ezcp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ezcp();
        }
        if (iOrdinal == 4) {
            return new ezco();
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
        synchronized (ezcp.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
