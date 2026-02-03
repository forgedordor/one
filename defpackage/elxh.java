package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elxh extends evsn implements evui {
    public static final elxh a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        elxh elxhVar = new elxh();
        a = elxhVar;
        evsn.registerDefaultInstance(elxh.class, elxhVar);
    }

    private elxh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", elxf.class, elwy.class, elww.class, elwu.class, elxb.class});
        }
        if (iOrdinal == 3) {
            return new elxh();
        }
        if (iOrdinal == 4) {
            return new elwr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elxh.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
