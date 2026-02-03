package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etpk extends evsn implements evui {
    public static final etpk a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public int e;
    public evvp f;
    public evvp g;
    public int h;
    private int j;

    static {
        etpk etpkVar = new etpk();
        a = etpkVar;
        evsn.registerDefaultInstance(etpk.class, etpkVar);
    }

    private etpk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005ဉ\u0000\u0006ဉ\u0001\u0007\u0004", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new etpk();
        }
        if (iOrdinal == 4) {
            return new etpi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etpk.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
