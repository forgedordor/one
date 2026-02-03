package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aufb extends evsn implements evui {
    public static final aufb a;
    private static volatile evuo e;
    public int b;
    public aubq c;
    public evvp d;

    static {
        aufb aufbVar = new aufb();
        a = aufbVar;
        evsn.registerDefaultInstance(aufb.class, aufbVar);
    }

    private aufb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aufb();
        }
        if (iOrdinal == 4) {
            return new aufa();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (aufb.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
