package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eynv extends evsn implements evui {
    public static final eynv a;
    private static volatile evuo e;
    public int b;
    public eysq c;
    public evtg d = emptyProtobufList();

    static {
        eynv eynvVar = new eynv();
        a = eynvVar;
        evsn.registerDefaultInstance(eynv.class, eynvVar);
    }

    private eynv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", eynn.class});
        }
        if (iOrdinal == 3) {
            return new eynv();
        }
        if (iOrdinal == 4) {
            return new eynu();
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
        synchronized (eynv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
