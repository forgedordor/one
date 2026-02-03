package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epms extends evsn implements evui {
    public static final epms a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        epms epmsVar = new epms();
        a = epmsVar;
        evsn.registerDefaultInstance(epms.class, epmsVar);
    }

    private epms() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0000\u000b\u0010\u0006\u0000\u0000\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000", new Object[]{"c", "b", epnf.class, epni.class, epnf.class, epni.class, epna.class, epnc.class});
        }
        if (iOrdinal == 3) {
            return new epms();
        }
        if (iOrdinal == 4) {
            return new epmq();
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
        synchronized (epms.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
