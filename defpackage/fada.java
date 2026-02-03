package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fada extends evsn implements evui {
    public static final fada a;
    private static volatile evuo e;
    public ezpr b;
    public evqs c = evqs.b;
    public evtg d = emptyProtobufList();
    private int f;

    static {
        fada fadaVar = new fada();
        a = fadaVar;
        evsn.registerDefaultInstance(fada.class, fadaVar);
    }

    private fada() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0003\n\u0004\u001c", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new fada();
        }
        if (iOrdinal == 4) {
            return new facz();
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
        synchronized (fada.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
