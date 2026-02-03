package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chut extends evsn implements evui {
    public static final chut a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public evqs e = evqs.b;

    static {
        chut chutVar = new chut();
        a = chutVar;
        evsn.registerDefaultInstance(chut.class, chutVar);
    }

    private chut() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005ည\u0000", new Object[]{"d", "c", "b", chvb.class, chuv.class, chvd.class, "e"});
        }
        if (iOrdinal == 3) {
            return new chut();
        }
        if (iOrdinal == 4) {
            return new chus();
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
        synchronized (chut.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
