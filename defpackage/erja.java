package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erja extends evsn implements evui {
    public static final erja a;
    private static volatile evuo e;
    public int b;
    public erjc c;
    public int d;

    static {
        erja erjaVar = new erja();
        a = erjaVar;
        evsn.registerDefaultInstance(erja.class, erjaVar);
    }

    private erja() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new erja();
        }
        if (iOrdinal == 4) {
            return new eriz();
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
        synchronized (erja.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
