package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etro extends evsn implements evui {
    public static final etro a;
    private static volatile evuo g;
    public int b;
    public int e;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        etro etroVar = new etro();
        a = etroVar;
        evsn.registerDefaultInstance(etro.class, etroVar);
    }

    private etro() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new etro();
        }
        if (iOrdinal == 4) {
            return new etrn();
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
        synchronized (etro.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
