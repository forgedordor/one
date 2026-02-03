package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezkp extends evsn implements evui {
    public static final ezkp a;
    private static volatile evuo b;

    static {
        ezkp ezkpVar = new ezkp();
        a = ezkpVar;
        evsn.registerDefaultInstance(ezkp.class, ezkpVar);
    }

    private ezkp() {
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
            return new ezkp();
        }
        if (iOrdinal == 4) {
            return new ezko();
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
        synchronized (ezkp.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
