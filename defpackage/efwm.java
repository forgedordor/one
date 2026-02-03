package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efwm extends evsn implements evui {
    public static final efwm a;
    private static volatile evuo c;
    public evvp b;
    private int d;

    static {
        efwm efwmVar = new efwm();
        a = efwmVar;
        evsn.registerDefaultInstance(efwm.class, efwmVar);
    }

    private efwm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0005", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new efwm();
        }
        if (iOrdinal == 4) {
            return new efwl();
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
        synchronized (efwm.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
