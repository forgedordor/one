package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euzy extends evsn implements evui {
    public static final euzy a;
    public static final evsl b;
    private static volatile evuo f;
    public int c;
    public euzs d;
    public euyp e;

    static {
        euzy euzyVar = new euzy();
        a = euzyVar;
        evsn.registerDefaultInstance(euzy.class, euzyVar);
        b = evsn.newSingularGeneratedExtension(erxu.a, euzyVar, euzyVar, null, 462704549, evwh.MESSAGE, euzy.class);
    }

    private euzy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new euzy();
        }
        if (iOrdinal == 4) {
            return new euzx();
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
        synchronized (euzy.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
