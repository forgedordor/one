package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awpt extends evsn implements evui {
    public static final awpt a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        awpt awptVar = new awpt();
        a = awptVar;
        evsn.registerDefaultInstance(awpt.class, awptVar);
    }

    private awpt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", awps.a});
        }
        if (iOrdinal == 3) {
            return new awpt();
        }
        if (iOrdinal == 4) {
            return new awpp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (awpt.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
