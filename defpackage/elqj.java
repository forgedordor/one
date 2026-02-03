package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elqj extends evsn implements evui {
    public static final elqj a;
    private static volatile evuo e;
    public int b;
    public evtg c = emptyProtobufList();
    public int d;

    static {
        elqj elqjVar = new elqj();
        a = elqjVar;
        evsn.registerDefaultInstance(elqj.class, elqjVar);
    }

    private elqj() {
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
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000", new Object[]{"b", "c", elqg.class, "d", elqi.a});
        }
        if (iOrdinal == 3) {
            return new elqj();
        }
        if (iOrdinal == 4) {
            return new elqh();
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
        synchronized (elqj.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
