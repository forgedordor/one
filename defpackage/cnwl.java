package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnwl extends evsn implements evui {
    public static final cnwl a;
    private static volatile evuo h;
    public int b;
    public boolean c;
    public evvp d;
    public evvp e;
    public evvp f;
    public boolean g;

    static {
        cnwl cnwlVar = new cnwl();
        a = cnwlVar;
        evsn.registerDefaultInstance(cnwl.class, cnwlVar);
    }

    private cnwl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new cnwl();
        }
        if (iOrdinal == 4) {
            return new cnwk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cnwl.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
