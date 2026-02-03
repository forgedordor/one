package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoaw extends evsn implements evui {
    public static final eoaw a;
    private static volatile evuo i;
    public int b;
    public enpl c;
    public enpl d;
    public String e = "";
    public String f = "";
    public int g;
    public int h;

    static {
        eoaw eoawVar = new eoaw();
        a = eoawVar;
        evsn.registerDefaultInstance(eoaw.class, eoawVar);
    }

    private eoaw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new eoaw();
        }
        if (iOrdinal == 4) {
            return new eoav();
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
        synchronized (eoaw.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
