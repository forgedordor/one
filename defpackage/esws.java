package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esws extends evsn implements evui {
    public static final esws a;
    private static volatile evuo e;
    public int b;
    public int c;
    public String d = "";

    static {
        esws eswsVar = new esws();
        a = eswsVar;
        evsn.registerDefaultInstance(esws.class, eswsVar);
    }

    private esws() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new esws();
        }
        if (iOrdinal == 4) {
            return new eswr();
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
        synchronized (esws.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
