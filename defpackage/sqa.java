package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqa extends evsn implements evui {
    public static final sqa a;
    private static volatile evuo d;
    public String b = "";
    public String c = "";

    static {
        sqa sqaVar = new sqa();
        a = sqaVar;
        evsn.registerDefaultInstance(sqa.class, sqaVar);
    }

    private sqa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0006\u0002\u0000\u0000\u0000\u0001Ȉ\u0006Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new sqa();
        }
        if (iOrdinal == 4) {
            return new spz();
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
        synchronized (sqa.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
