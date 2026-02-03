package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnlr extends evsn implements evui {
    public static final cnlr a;
    private static volatile evuo d;
    public String b = "";
    public String c = "";

    static {
        cnlr cnlrVar = new cnlr();
        a = cnlrVar;
        evsn.registerDefaultInstance(cnlr.class, cnlrVar);
    }

    private cnlr() {
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
            return new cnlr();
        }
        if (iOrdinal == 4) {
            return new cnlq();
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
        synchronized (cnlr.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
