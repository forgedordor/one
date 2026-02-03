package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evff extends evsn implements evui {
    public static final evff a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        evff evffVar = new evff();
        a = evffVar;
        evsn.registerDefaultInstance(evff.class, evffVar);
    }

    private evff() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0000\u0001\t\u0007\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"c", "b", evfs.class, evey.class, evfb.class, evhy.class, evfh.class, evhh.class, evfu.class});
        }
        if (iOrdinal == 3) {
            return new evff();
        }
        if (iOrdinal == 4) {
            return new evfe();
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
        synchronized (evff.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
