package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exee extends evsn implements evui {
    public static final exee a;
    private static volatile evuo g;
    public int b;
    public evvp c;
    public evrj d;
    public exhu e;
    public exec f;

    static {
        exee exeeVar = new exee();
        a = exeeVar;
        evsn.registerDefaultInstance(exee.class, exeeVar);
    }

    private exee() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0007ဉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new exee();
        }
        if (iOrdinal == 4) {
            return new exed();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exee.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
