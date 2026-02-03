package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqns extends evsn implements evui {
    public static final eqns a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        eqns eqnsVar = new eqns();
        a = eqnsVar;
        evsn.registerDefaultInstance(eqns.class, eqnsVar);
    }

    private eqns() {
    }

    public final void a() {
        evtg evtgVar = this.b;
        if (evtgVar.c()) {
            return;
        }
        this.b = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", eqnu.class});
        }
        if (iOrdinal == 3) {
            return new eqns();
        }
        if (iOrdinal == 4) {
            return new eqnr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eqns.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
