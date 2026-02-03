package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eljb extends evsn implements evui {
    public static final eljb a;
    private static volatile evuo b;

    static {
        eljb eljbVar = new eljb();
        a = eljbVar;
        evsn.registerDefaultInstance(eljb.class, eljbVar);
    }

    private eljb() {
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
            return new eljb();
        }
        if (iOrdinal == 4) {
            return new elja();
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
        synchronized (eljb.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
