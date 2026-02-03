package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feda extends evsn implements evui {
    public static final feda a;
    private static volatile evuo f;
    public int b;
    public evtg c = emptyProtobufList();
    public evtg d = emptyProtobufList();
    public fecy e;

    static {
        feda fedaVar = new feda();
        a = fedaVar;
        evsn.registerDefaultInstance(feda.class, fedaVar);
    }

    private feda() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"b", "c", fedg.class, "d", fecw.class, "e"});
        }
        if (iOrdinal == 3) {
            return new feda();
        }
        if (iOrdinal == 4) {
            return new fecz();
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
        synchronized (feda.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
