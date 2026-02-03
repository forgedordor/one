package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euyd extends evsn implements evui {
    public static final euyd a;
    public static final evsl b;
    private static volatile evuo d;
    public evub c = evub.a;

    static {
        euyd euydVar = new euyd();
        a = euydVar;
        evsn.registerDefaultInstance(euyd.class, euydVar);
        b = evsn.newSingularGeneratedExtension(erxu.a, euydVar, euydVar, null, 458105876, evwh.MESSAGE, euyd.class);
    }

    private euyd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"c", euyc.a});
        }
        if (iOrdinal == 3) {
            return new euyd();
        }
        if (iOrdinal == 4) {
            return new euyb();
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
        synchronized (euyd.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
