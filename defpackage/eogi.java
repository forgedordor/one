package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogi extends evsn implements evui {
    public static final eogi a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public int e;
    public eoge f;
    public eogc g;
    public eohv h;

    static {
        eogi eogiVar = new eogi();
        a = eogiVar;
        evsn.registerDefaultInstance(eogi.class, eogiVar);
    }

    private eogi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0006ဉ\u0005\bဉ\u0007\rဉ\f", new Object[]{"b", "c", eogg.a, "d", eogh.a, "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new eogi();
        }
        if (iOrdinal == 4) {
            return new eogf();
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
        synchronized (eogi.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
