package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvt extends evsn implements evui {
    public static final bvvt a;
    private static volatile evuo d;
    public String b = "";
    public evtg c = emptyProtobufList();

    static {
        bvvt bvvtVar = new bvvt();
        a = bvvtVar;
        evsn.registerDefaultInstance(bvvt.class, bvvtVar);
    }

    private bvvt() {
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
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", aubq.class});
        }
        if (iOrdinal == 3) {
            return new bvvt();
        }
        if (iOrdinal == 4) {
            return new bvvs();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (bvvt.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
