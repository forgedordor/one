package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejji extends evsn implements evui {
    public static final evsy a = new ejiu();
    public static final ejji b;
    private static volatile evuo h;
    public int c;
    public Object e;
    public ejjk g;
    public int d = 0;
    public evsx f = emptyIntList();

    static {
        ejji ejjiVar = new ejji();
        b = ejjiVar;
        evsn.registerDefaultInstance(ejji.class, ejjiVar);
    }

    private ejji() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003ࠞ\u0005ဉ\u0001", new Object[]{"e", "d", "c", ejix.class, ejjh.class, "f", ezam.a, "g"});
        }
        if (iOrdinal == 3) {
            return new ejji();
        }
        if (iOrdinal == 4) {
            return new ejiv();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ejji.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
