package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezrj extends evsn implements evui {
    public static final ezrj a;
    private static volatile evuo c;
    public ezrp b;
    private int d;

    static {
        ezrj ezrjVar = new ezrj();
        a = ezrjVar;
        evsn.registerDefaultInstance(ezrj.class, ezrjVar);
    }

    private ezrj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new ezrj();
        }
        if (iOrdinal == 4) {
            return new ezri();
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
        synchronized (ezrj.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
