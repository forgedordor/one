package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fedp extends evsn implements evui {
    public static final fedp a;
    public static final evsl b;
    private static volatile evuo e;
    public evta c = emptyLongList();
    public evta d = emptyLongList();

    static {
        fedp fedpVar = new fedp();
        a = fedpVar;
        evsn.registerDefaultInstance(fedp.class, fedpVar);
        b = evsn.newSingularGeneratedExtension(feig.a, fedpVar, fedpVar, null, 100, evwh.MESSAGE, fedp.class);
    }

    private fedp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new fedp();
        }
        if (iOrdinal == 4) {
            return new fedo();
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
        synchronized (fedp.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
