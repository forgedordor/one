package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryx extends evsn implements evui {
    public static final dryx a;
    public static final evsl b;
    private static volatile evuo d;
    public drwe c;
    private int e;

    static {
        dryx dryxVar = new dryx();
        a = dryxVar;
        evsn.registerDefaultInstance(dryx.class, dryxVar);
        b = evsn.newSingularGeneratedExtension(dryn.a, dryxVar, dryxVar, null, 9003, evwh.MESSAGE, dryx.class);
    }

    private dryx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"e", "c"});
        }
        if (iOrdinal == 3) {
            return new dryx();
        }
        if (iOrdinal == 4) {
            return new dryw();
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
        synchronized (dryx.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
