package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddff extends evsn implements evui {
    public static final ddff a;
    private static volatile evuo c;
    public evub b;
    private evub d;

    static {
        ddff ddffVar = new ddff();
        a = ddffVar;
        evsn.registerDefaultInstance(ddff.class, ddffVar);
    }

    private ddff() {
        evub evubVar = evub.a;
        this.b = evubVar;
        this.d = evubVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0002\u0000\u0000\u00012\u00032", new Object[]{"b", ddfd.a, "d", ddfc.a});
        }
        if (iOrdinal == 3) {
            return new ddff();
        }
        if (iOrdinal == 4) {
            return new ddfe();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ddff.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
