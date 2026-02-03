package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyxq extends evsn implements evui {
    public static final eyxq a;
    private static volatile evuo c;
    public ezpr b;
    private int d;

    static {
        eyxq eyxqVar = new eyxq();
        a = eyxqVar;
        evsn.registerDefaultInstance(eyxq.class, eyxqVar);
    }

    private eyxq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new eyxq();
        }
        if (iOrdinal == 4) {
            return new eyxp();
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
        synchronized (eyxq.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
