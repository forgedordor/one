package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewbc extends evsn implements evui {
    public static final ewbc a;
    private static volatile evuo e;
    public int b;
    public int c;
    public evtg d = emptyProtobufList();

    static {
        ewbc ewbcVar = new ewbc();
        a = ewbcVar;
        evsn.registerDefaultInstance(ewbc.class, ewbcVar);
    }

    private ewbc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"b", "c", ewba.a, "d", evzo.class});
        }
        if (iOrdinal == 3) {
            return new ewbc();
        }
        if (iOrdinal == 4) {
            return new ewaz();
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
        synchronized (ewbc.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
