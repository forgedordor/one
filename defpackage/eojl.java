package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eojl extends evsn implements evui {
    public static final eojl a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public evtg e = emptyProtobufList();
    public long f;

    static {
        eojl eojlVar = new eojl();
        a = eojlVar;
        evsn.registerDefaultInstance(eojl.class, eojlVar);
    }

    private eojl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004ဂ\u0002", new Object[]{"b", "c", eokv.a, "d", eokw.a, "e", eoir.class, "f"});
        }
        if (iOrdinal == 3) {
            return new eojl();
        }
        if (iOrdinal == 4) {
            return new eojk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eojl.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
