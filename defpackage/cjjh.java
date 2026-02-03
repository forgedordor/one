package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjjh extends evsn implements evui {
    public static final cjjh a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public cjgr e;

    static {
        cjjh cjjhVar = new cjjh();
        a = cjjhVar;
        evsn.registerDefaultInstance(cjjh.class, cjjhVar);
    }

    private cjjh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000", new Object[]{"d", "c", "b", "e", cjhs.class, cjhu.class});
        }
        if (iOrdinal == 3) {
            return new cjjh();
        }
        if (iOrdinal == 4) {
            return new cjjg();
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
        synchronized (cjjh.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
