package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etry extends evsn implements evui {
    public static final etry a;
    private static volatile evuo e;
    public int b;
    public int c;
    public etrw d;

    static {
        etry etryVar = new etry();
        a = etryVar;
        evsn.registerDefaultInstance(etry.class, etryVar);
    }

    private etry() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0003ဉ\u0003", new Object[]{"b", "c", ethw.a, "d"});
        }
        if (iOrdinal == 3) {
            return new etry();
        }
        if (iOrdinal == 4) {
            return new etrx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etry.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
