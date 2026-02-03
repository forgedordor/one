package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciju extends evsn implements evui {
    public static final ciju a;
    private static volatile evuo i;
    public int b;
    public String c = "";
    public int d;
    public evvp e;
    public boolean f;
    public aubq g;
    public auib h;

    static {
        ciju cijuVar = new ciju();
        a = cijuVar;
        evsn.registerDefaultInstance(ciju.class, cijuVar);
    }

    private ciju() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0004ဉ\u0000\u0005ဇ\u0001\u0007ဉ\u0003\bဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ciju();
        }
        if (iOrdinal == 4) {
            return new cijs();
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
        synchronized (ciju.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
