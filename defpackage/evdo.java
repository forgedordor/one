package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evdo extends evsn implements evui {
    public static final evdo a;
    private static volatile evuo b;

    static {
        evdo evdoVar = new evdo();
        a = evdoVar;
        evsn.registerDefaultInstance(evdo.class, evdoVar);
    }

    private evdo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new evdo();
        }
        if (iOrdinal == 4) {
            return new evdn();
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
        synchronized (evdo.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
