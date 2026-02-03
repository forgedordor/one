package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eowu extends evsn implements evui {
    public static final eowu a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        eowu eowuVar = new eowu();
        a = eowuVar;
        evsn.registerDefaultInstance(eowu.class, eowuVar);
    }

    private eowu() {
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
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", eowm.class});
        }
        if (iOrdinal == 3) {
            return new eowu();
        }
        if (iOrdinal == 4) {
            return new eowt();
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
        synchronized (eowu.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
