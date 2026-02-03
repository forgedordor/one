package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqjl extends evsn implements evui {
    public static final eqjl a;
    private static volatile evuo c;
    private String d = "";
    public String b = "";

    static {
        eqjl eqjlVar = new eqjl();
        a = eqjlVar;
        evsn.registerDefaultInstance(eqjl.class, eqjlVar);
    }

    private eqjl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0000\u0000\u0001Ȉ\u0004Ȉ", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new eqjl();
        }
        if (iOrdinal == 4) {
            return new eqjk();
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
        synchronized (eqjl.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
