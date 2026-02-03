package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exct extends evsn implements evui {
    public static final exct a;
    private static volatile evuo d;
    public int b;
    public excq c;
    private int e;

    static {
        exct exctVar = new exct();
        a = exctVar;
        evsn.registerDefaultInstance(exct.class, exctVar);
    }

    private exct() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"e", "b", ewus.a, "c"});
        }
        if (iOrdinal == 3) {
            return new exct();
        }
        if (iOrdinal == 4) {
            return new excs();
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
        synchronized (exct.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
