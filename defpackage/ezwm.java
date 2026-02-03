package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezwm extends evsn implements evui {
    public static final ezwm a;
    private static volatile evuo b;

    static {
        ezwm ezwmVar = new ezwm();
        a = ezwmVar;
        evsn.registerDefaultInstance(ezwm.class, ezwmVar);
    }

    private ezwm() {
        emptyProtobufList();
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
            return new ezwm();
        }
        if (iOrdinal == 4) {
            return new ezwl();
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
        synchronized (ezwm.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
