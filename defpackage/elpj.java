package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elpj extends evsn implements evui {
    public static final elpj a;
    private static volatile evuo h;
    public int b;
    public int c;
    public long d;
    public elij e;
    public eltm f;
    public elij g;

    static {
        elpj elpjVar = new elpj();
        a = elpjVar;
        evsn.registerDefaultInstance(elpj.class, elpjVar);
    }

    private elpj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", elpi.a, "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new elpj();
        }
        if (iOrdinal == 4) {
            return new elph();
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
        synchronized (elpj.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
