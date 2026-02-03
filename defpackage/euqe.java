package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euqe extends evsn implements evui {
    public static final euqe a;
    public static final evsl b;
    private static volatile evuo e;
    public int c;
    public euqa d;

    static {
        euqe euqeVar = new euqe();
        a = euqeVar;
        evsn.registerDefaultInstance(euqe.class, euqeVar);
        b = evsn.newSingularGeneratedExtension(emmz.a, euqeVar, euqeVar, null, 955, evwh.MESSAGE, euqe.class);
    }

    private euqe() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new euqe();
        }
        if (iOrdinal == 4) {
            return new euqd();
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
        synchronized (euqe.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
