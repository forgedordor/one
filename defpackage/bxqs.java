package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxqs extends evsn implements evui {
    public static final bxqs a;
    private static volatile evuo d;
    public String b = "";
    public String c = "";

    static {
        bxqs bxqsVar = new bxqs();
        a = bxqsVar;
        evsn.registerDefaultInstance(bxqs.class, bxqsVar);
    }

    private bxqs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new bxqs();
        }
        if (iOrdinal == 4) {
            return new bxqr();
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
        synchronized (bxqs.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
