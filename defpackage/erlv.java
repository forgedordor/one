package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erlv extends evsn implements evui {
    public static final erlv a;
    private static volatile evuo d;
    public int b;
    public erlx c;

    static {
        erlv erlvVar = new erlv();
        a = erlvVar;
        evsn.registerDefaultInstance(erlv.class, erlvVar);
    }

    private erlv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new erlv();
        }
        if (iOrdinal == 4) {
            return new erlu();
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
        synchronized (erlv.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
