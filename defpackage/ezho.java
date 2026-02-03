package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezho extends evsn implements evui {
    public static final ezho a;
    private static volatile evuo e;
    public int b;
    public ezpp c;
    public evtg d;

    static {
        ezho ezhoVar = new ezho();
        a = ezhoVar;
        evsn.registerDefaultInstance(ezho.class, ezhoVar);
    }

    private ezho() {
        evsn.emptyProtobufList();
        this.d = emptyProtobufList();
    }

    public final void a() {
        evtg evtgVar = this.d;
        if (evtgVar.c()) {
            return;
        }
        this.d = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0004\u001b", new Object[]{"b", "c", "d", ezph.class});
        }
        if (iOrdinal == 3) {
            return new ezho();
        }
        if (iOrdinal == 4) {
            return new ezhn();
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
        synchronized (ezho.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
