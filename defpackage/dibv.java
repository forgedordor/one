package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dibv extends evsn implements evui {
    public static final dibv a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        dibv dibvVar = new dibv();
        a = dibvVar;
        evsn.registerDefaultInstance(dibv.class, dibvVar);
    }

    private dibv() {
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
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", dibr.class});
        }
        if (iOrdinal == 3) {
            return new dibv();
        }
        if (iOrdinal == 4) {
            return new dibp();
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
        synchronized (dibv.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
