package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoee extends evsn implements evui {
    public static final eoee a;
    private static volatile evuo b;

    static {
        eoee eoeeVar = new eoee();
        a = eoeeVar;
        evsn.registerDefaultInstance(eoee.class, eoeeVar);
    }

    private eoee() {
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
            return new eoee();
        }
        if (iOrdinal == 4) {
            return new eoed();
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
        synchronized (eoee.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
