package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enhc extends evsn implements evui {
    public static final enhc a;
    private static volatile evuo b;

    static {
        enhc enhcVar = new enhc();
        a = enhcVar;
        evsn.registerDefaultInstance(enhc.class, enhcVar);
    }

    private enhc() {
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
            return new enhc();
        }
        if (iOrdinal == 4) {
            return new enhb();
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
        synchronized (enhc.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
