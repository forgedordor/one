package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtpm extends evsn implements evui {
    public static final dtpm a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        dtpm dtpmVar = new dtpm();
        a = dtpmVar;
        evsn.registerDefaultInstance(dtpm.class, dtpmVar);
    }

    private dtpm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", dtpk.class});
        }
        if (iOrdinal == 3) {
            return new dtpm();
        }
        if (iOrdinal == 4) {
            return new dtpl();
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
        synchronized (dtpm.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
