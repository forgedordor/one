package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eovu extends evsn implements evui {
    public static final eovu a;
    private static volatile evuo i;
    public int b;
    public boolean c;
    public boolean d;
    public epdc e;
    public int f;
    public epdg g;
    public boolean h;

    static {
        eovu eovuVar = new eovu();
        a = eovuVar;
        evsn.registerDefaultInstance(eovu.class, eovuVar);
    }

    private eovu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003ဉ\u0000\u0004\f\u0005ဉ\u0001\u0006ဇ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new eovu();
        }
        if (iOrdinal == 4) {
            return new eovt();
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
        synchronized (eovu.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
