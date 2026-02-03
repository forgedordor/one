package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avde extends evsn implements evui {
    public static final avde a;
    private static volatile evuo j;
    public int b;
    public int c;
    public avdd d;
    public evvp e;
    public evvp f;
    public boolean g;
    public evvp h;
    public evvp i;

    static {
        avde avdeVar = new avde();
        a = avdeVar;
        evsn.registerDefaultInstance(avde.class, avdeVar);
    }

    private avde() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဇ\u0003\u0006ဉ\u0004\u0007ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new avde();
        }
        if (iOrdinal == 4) {
            return new avda();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (avde.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
