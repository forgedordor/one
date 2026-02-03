package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evnb extends evsn implements evui {
    public static final evnb a;
    private static volatile evuo b;

    static {
        evnb evnbVar = new evnb();
        a = evnbVar;
        evsn.registerDefaultInstance(evnb.class, evnbVar);
    }

    private evnb() {
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
            return new evnb();
        }
        if (iOrdinal == 4) {
            return new evna();
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
        synchronized (evnb.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
