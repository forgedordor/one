package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cotf extends evsn implements evui {
    public static final cotf a;
    private static volatile evuo e;
    public evqs b = evqs.b;
    public String c = "";
    public String d = "";

    static {
        cotf cotfVar = new cotf();
        a = cotfVar;
        evsn.registerDefaultInstance(cotf.class, cotfVar);
    }

    private cotf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\n\u0003Ȉ\u0004Ȉ", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new cotf();
        }
        if (iOrdinal == 4) {
            return new cote();
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
        synchronized (cotf.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
