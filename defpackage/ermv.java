package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermv extends evsn implements evui {
    public static final ermv a;
    private static volatile evuo e;
    public int b;
    public int c;
    public ermx d;

    static {
        ermv ermvVar = new ermv();
        a = ermvVar;
        evsn.registerDefaultInstance(ermv.class, ermvVar);
    }

    private ermv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ermv();
        }
        if (iOrdinal == 4) {
            return new ermu();
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
        synchronized (ermv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
