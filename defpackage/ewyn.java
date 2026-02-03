package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewyn extends evsn implements evui {
    public static final ewyn a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public int d;

    static {
        ewyn ewynVar = new ewyn();
        a = ewynVar;
        evsn.registerDefaultInstance(ewyn.class, ewynVar);
    }

    private ewyn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဋ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ewyn();
        }
        if (iOrdinal == 4) {
            return new ewym();
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
        synchronized (ewyn.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
