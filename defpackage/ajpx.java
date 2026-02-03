package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajpx extends evsn implements evui {
    public static final ajpx a;
    private static volatile evuo d;
    public evtg b = evsn.emptyProtobufList();
    public boolean c;

    static {
        ajpx ajpxVar = new ajpx();
        a = ajpxVar;
        evsn.registerDefaultInstance(ajpx.class, ajpxVar);
    }

    private ajpx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\u0007", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ajpx();
        }
        if (iOrdinal == 4) {
            return new ajpw();
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
        synchronized (ajpx.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
