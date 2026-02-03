package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class envr extends evsn implements evui {
    public static final envr a;
    private static volatile evuo b;

    static {
        envr envrVar = new envr();
        a = envrVar;
        evsn.registerDefaultInstance(envr.class, envrVar);
    }

    private envr() {
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
            return new envr();
        }
        if (iOrdinal == 4) {
            return new envq();
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
        synchronized (envr.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
