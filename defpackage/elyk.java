package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elyk extends evsn implements evui {
    public static final elyk a;
    private static volatile evuo d;
    public int b;
    public String c = "";

    static {
        elyk elykVar = new elyk();
        a = elykVar;
        evsn.registerDefaultInstance(elyk.class, elykVar);
    }

    private elyk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new elyk();
        }
        if (iOrdinal == 4) {
            return new elyj();
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
        synchronized (elyk.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
