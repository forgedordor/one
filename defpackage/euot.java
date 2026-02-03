package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euot extends evsn implements evui {
    public static final euot a;
    private static volatile evuo b;
    private evub c = evub.a;

    static {
        euot euotVar = new euot();
        a = euotVar;
        evsn.registerDefaultInstance(euot.class, euotVar);
    }

    private euot() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", euos.a});
        }
        if (iOrdinal == 3) {
            return new euot();
        }
        if (iOrdinal == 4) {
            return new euor();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (euot.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
