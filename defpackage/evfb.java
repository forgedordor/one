package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evfb extends evsn implements evui {
    public static final evfb a;
    private static volatile evuo b;

    static {
        evfb evfbVar = new evfb();
        a = evfbVar;
        evsn.registerDefaultInstance(evfb.class, evfbVar);
    }

    private evfb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new evfb();
        }
        if (iOrdinal == 4) {
            return new evfa();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evfb.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
