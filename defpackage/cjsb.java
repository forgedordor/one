package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjsb extends evsn<cjsb, cjrw> implements evui {
    public static final cjsb a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public evvp e;
    public boolean f;
    public boolean g;
    public int h;

    static {
        cjsb cjsbVar = new cjsb();
        a = cjsbVar;
        evsn.registerDefaultInstance(cjsb.class, cjsbVar);
    }

    private cjsb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0006ဇ\u0005\u0007ဌ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new cjsb();
        }
        if (iOrdinal == 4) {
            return new cjrw();
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
        synchronized (cjsb.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
