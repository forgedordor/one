package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eowb extends evsn implements evui {
    public static final eowb a;
    private static volatile evuo b;

    static {
        eowb eowbVar = new eowb();
        a = eowbVar;
        evsn.registerDefaultInstance(eowb.class, eowbVar);
    }

    private eowb() {
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
            return new eowb();
        }
        if (iOrdinal == 4) {
            return new eowa();
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
        synchronized (eowb.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
