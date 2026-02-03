package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctba extends evsn implements evui {
    public static final ctba a;
    private static volatile evuo g;
    public int b;
    public int d;
    public evvp f;
    public String c = "";
    public String e = "";

    static {
        ctba ctbaVar = new ctba();
        a = ctbaVar;
        evsn.registerDefaultInstance(ctba.class, ctbaVar);
    }

    private ctba() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003ለ\u0000\u0004ဉ\u0001", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ctba();
        }
        if (iOrdinal == 4) {
            return new ctaz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ctba.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
