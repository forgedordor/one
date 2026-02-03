package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsa extends evsn implements evui {
    public static final etsa a;
    private static volatile evuo d;
    public String b = "";
    public long c;

    static {
        etsa etsaVar = new etsa();
        a = etsaVar;
        evsn.registerDefaultInstance(etsa.class, etsaVar);
    }

    private etsa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new etsa();
        }
        if (iOrdinal == 4) {
            return new etrz();
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
        synchronized (etsa.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
