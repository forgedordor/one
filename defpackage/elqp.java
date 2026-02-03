package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elqp extends evsn implements evui {
    public static final elqp a;
    private static volatile evuo j;
    public int b;
    public int c;
    public emin d;
    public emil e;
    public emib f;
    public emij g;
    public emhz h;
    public long i;

    static {
        elqp elqpVar = new elqp();
        a = elqpVar;
        evsn.registerDefaultInstance(elqp.class, elqpVar);
    }

    private elqp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဂ\u0006", new Object[]{"b", "c", elqm.a, "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new elqp();
        }
        if (iOrdinal == 4) {
            return new elqo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elqp.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
