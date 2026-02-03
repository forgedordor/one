package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eusr extends evsn implements evui {
    public static final eusr a;
    private static volatile evuo f;
    public String b = "";
    public int c;
    public int d;
    public boolean e;

    static {
        eusr eusrVar = new eusr();
        a = eusrVar;
        evsn.registerDefaultInstance(eusr.class, eusrVar);
    }

    private eusr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eusr();
        }
        if (iOrdinal == 4) {
            return new eusq();
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
        synchronized (eusr.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
