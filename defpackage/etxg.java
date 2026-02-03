package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etxg extends evsn implements evui {
    public static final etxg a;
    private static volatile evuo e;
    public int b;
    public etvy c;
    public String d = "";
    private int f;

    static {
        etxg etxgVar = new etxg();
        a = etxgVar;
        evsn.registerDefaultInstance(etxg.class, etxgVar);
    }

    private etxg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0004ဈ\u0003", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new etxg();
        }
        if (iOrdinal == 4) {
            return new etxf();
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
        synchronized (etxg.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
