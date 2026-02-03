package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clnv extends evsn implements evui {
    public static final clnv a;
    private static volatile evuo f;
    public int b;
    public cloq c;
    public evtg d = emptyProtobufList();
    public evtg e = emptyProtobufList();

    static {
        clnv clnvVar = new clnv();
        a = clnvVar;
        evsn.registerDefaultInstance(clnv.class, clnvVar);
    }

    private clnv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", clmr.class, "e", clmy.class});
        }
        if (iOrdinal == 3) {
            return new clnv();
        }
        if (iOrdinal == 4) {
            return new clnu();
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
        synchronized (clnv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
