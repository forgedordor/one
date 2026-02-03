package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezlv extends evsn implements evui {
    public static final ezlv a;
    private static volatile evuo f;
    public int b;
    public ezpp c;
    public evtg d = evsn.emptyProtobufList();
    public ezol e;

    static {
        ezlv ezlvVar = new ezlv();
        a = ezlvVar;
        evsn.registerDefaultInstance(ezlv.class, ezlvVar);
    }

    private ezlv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ț\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ezlv();
        }
        if (iOrdinal == 4) {
            return new ezlu();
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
        synchronized (ezlv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
