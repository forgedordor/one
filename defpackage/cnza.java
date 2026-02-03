package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnza extends evsn implements evui {
    public static final cnza a;
    private static volatile evuo h;
    public int b;
    public evtg c = emptyProtobufList();
    public cnyk d;
    public cnyp e;
    public boolean f;
    public evvp g;

    static {
        cnza cnzaVar = new cnza();
        a = cnzaVar;
        evsn.registerDefaultInstance(cnza.class, cnzaVar);
    }

    private cnza() {
    }

    public final void a() {
        evtg evtgVar = this.c;
        if (evtgVar.c()) {
            return;
        }
        this.c = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007\u0005ဉ\u0002", new Object[]{"b", "c", cnyz.class, "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new cnza();
        }
        if (iOrdinal == 4) {
            return new cnyl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cnza.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
