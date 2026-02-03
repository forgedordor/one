package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etmt extends evsn implements evui {
    public static final etmt a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        etmt etmtVar = new etmt();
        a = etmtVar;
        evsn.registerDefaultInstance(etmt.class, etmtVar);
    }

    private etmt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002;\u0000\u0003\u083f\u0000\u00047\u0000\u0005:\u0000", new Object[]{"d", "c", "b", "e", etmq.a});
        }
        if (iOrdinal == 3) {
            return new etmt();
        }
        if (iOrdinal == 4) {
            return new etmp();
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
        synchronized (etmt.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
