package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwvf extends evsn implements evui {
    public static final bwvf a;
    private static volatile evuo g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public aubq f;

    static {
        bwvf bwvfVar = new bwvf();
        a = bwvfVar;
        evsn.registerDefaultInstance(bwvf.class, bwvfVar);
    }

    private bwvf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002;\u0000\u0003᠌\u0000\u0004ဉ\u0001", new Object[]{"d", "c", "b", bwve.class, "e", elyc.a, "f"});
        }
        if (iOrdinal == 3) {
            return new bwvf();
        }
        if (iOrdinal == 4) {
            return new bwvc();
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
        synchronized (bwvf.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
