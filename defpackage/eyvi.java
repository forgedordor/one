package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyvi extends evsn implements evui {
    public static final eyvi a;
    private static volatile evuo d;
    public boolean b;
    public int c;

    static {
        eyvi eyviVar = new eyvi();
        a = eyviVar;
        evsn.registerDefaultInstance(eyvi.class, eyviVar);
    }

    private eyvi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0007\u0003\f", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eyvi();
        }
        if (iOrdinal == 4) {
            return new eyvh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eyvi.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
