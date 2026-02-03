package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezvi extends evsn implements evui {
    public static final ezvi a;
    private static volatile evuo d;
    public ezpr b;
    public evtg c = emptyProtobufList();
    private int e;

    static {
        ezvi ezviVar = new ezvi();
        a = ezviVar;
        evsn.registerDefaultInstance(ezvi.class, ezviVar);
    }

    private ezvi() {
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
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"e", "b", "c", ezvh.class});
        }
        if (iOrdinal == 3) {
            return new ezvi();
        }
        if (iOrdinal == 4) {
            return new ezvd();
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
        synchronized (ezvi.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
