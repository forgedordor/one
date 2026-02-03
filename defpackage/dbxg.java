package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxg extends evsn implements evui {
    public static final dbxg a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public evqs e = evqs.b;

    static {
        dbxg dbxgVar = new dbxg();
        a = dbxgVar;
        evsn.registerDefaultInstance(dbxg.class, dbxgVar);
    }

    private dbxg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ည\u0000", new Object[]{"d", "c", "b", dbxj.class, dbxe.class, "e"});
        }
        if (iOrdinal == 3) {
            return new dbxg();
        }
        if (iOrdinal == 4) {
            return new dbxf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbxg.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
