package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eusv extends evsn implements evui {
    public static final eusv a;
    private static volatile evuo b;

    static {
        eusv eusvVar = new eusv();
        a = eusvVar;
        evsn.registerDefaultInstance(eusv.class, eusvVar);
    }

    private eusv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new eusv();
        }
        if (iOrdinal == 4) {
            return new eusu();
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
        synchronized (eusv.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
