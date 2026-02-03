package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epnu extends evsn implements evui {
    public static final epnu a;
    private static volatile evuo f;
    public String b = "";
    public String c = "";
    public evqs d = evqs.b;
    public String e = "";

    static {
        epnu epnuVar = new epnu();
        a = epnuVar;
        evsn.registerDefaultInstance(epnu.class, epnuVar);
    }

    private epnu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0005\n\u0006Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new epnu();
        }
        if (iOrdinal == 4) {
            return new epnt();
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
        synchronized (epnu.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
