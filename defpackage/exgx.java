package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exgx extends evsn implements evui {
    public static final exgx a;
    private static volatile evuo g;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        exgx exgxVar = new exgx();
        a = exgxVar;
        evsn.registerDefaultInstance(exgx.class, exgxVar);
    }

    private exgx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new exgx();
        }
        if (iOrdinal == 4) {
            return new exgw();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exgx.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
