package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyny extends evsn implements evui {
    public static final eyny a;
    private static volatile evuo b;
    private evub c = evub.a;

    static {
        eyny eynyVar = new eyny();
        a = eynyVar;
        evsn.registerDefaultInstance(eyny.class, eynyVar);
    }

    private eyny() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", eynx.a});
        }
        if (iOrdinal == 3) {
            return new eyny();
        }
        if (iOrdinal == 4) {
            return new eynw();
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
        synchronized (eyny.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
