package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evll extends evsn implements evui {
    public static final evll a;
    private static volatile evuo i;
    public int b;
    public eyax c;
    public eyax d;
    public eyax e;
    public eyax f;
    public eyax g;
    public eyax h;

    static {
        evll evllVar = new evll();
        a = evllVar;
        evsn.registerDefaultInstance(evll.class, evllVar);
    }

    private evll() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new evll();
        }
        if (iOrdinal == 4) {
            return new evlk();
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
        synchronized (evll.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
