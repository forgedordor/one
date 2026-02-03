package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ser extends evsn implements evui {
    public static final ser a;
    private static volatile evuo e;
    public int b;
    public set c;
    public sev d;

    static {
        ser serVar = new ser();
        a = serVar;
        evsn.registerDefaultInstance(ser.class, serVar);
    }

    private ser() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ser();
        }
        if (iOrdinal == 4) {
            return new seq();
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
        synchronized (ser.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
