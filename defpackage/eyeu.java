package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyeu extends evsn implements evui {
    public static final eyeu a;
    private static volatile evuo f;
    public int b;
    public long c;
    public evtg d = emptyProtobufList();
    public evqs e = evqs.b;

    static {
        eyeu eyeuVar = new eyeu();
        a = eyeuVar;
        evsn.registerDefaultInstance(eyeu.class, eyeuVar);
    }

    private eyeu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ည\u0002", new Object[]{"b", "c", "d", eyes.class, "e"});
        }
        if (iOrdinal == 3) {
            return new eyeu();
        }
        if (iOrdinal == 4) {
            return new eyet();
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
        synchronized (eyeu.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
