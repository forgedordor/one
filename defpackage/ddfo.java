package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddfo extends evsn implements evui {
    public static final ddfo a;
    private static volatile evuo j;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;
    public boolean h;
    public ddfm i;
    private int k;

    static {
        ddfo ddfoVar = new ddfo();
        a = ddfoVar;
        evsn.registerDefaultInstance(ddfo.class, ddfoVar);
    }

    private ddfo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002\u0005ለ\u0003\u0006\u0007\u0007\u0007\bဉ\u0004", new Object[]{"k", "b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new ddfo();
        }
        if (iOrdinal == 4) {
            return new ddfn();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ddfo.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
