package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class expk extends evsn implements evui {
    public static final expk a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        expk expkVar = new expk();
        a = expkVar;
        evsn.registerDefaultInstance(expk.class, expkVar);
    }

    private expk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new expk();
        }
        if (iOrdinal == 4) {
            return new expj();
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
        synchronized (expk.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
