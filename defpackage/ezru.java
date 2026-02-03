package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezru extends evsn implements evui {
    public static final ezru a;
    private static volatile evuo f;
    public ezol b;
    public long c;
    public ezrp d;
    public evtg e = emptyProtobufList();
    private int g;

    static {
        ezru ezruVar = new ezru();
        a = ezruVar;
        evsn.registerDefaultInstance(ezru.class, ezruVar);
    }

    private ezru() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u0002\u0003ဉ\u0001\u0004\u001b", new Object[]{"g", "b", "c", "d", "e", ezol.class});
        }
        if (iOrdinal == 3) {
            return new ezru();
        }
        if (iOrdinal == 4) {
            return new ezrt();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezru.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
