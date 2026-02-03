package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enqa extends evsn implements evui {
    public static final enqa a;
    private static volatile evuo f;
    public int b;
    public long c;
    public evrj d;
    public evrj e;

    static {
        enqa enqaVar = new enqa();
        a = enqaVar;
        evsn.registerDefaultInstance(enqa.class, enqaVar);
    }

    private enqa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new enqa();
        }
        if (iOrdinal == 4) {
            return new enpz();
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
        synchronized (enqa.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
