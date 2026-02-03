package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auen extends evsn implements evui {
    public static final auen a;
    private static volatile evuo e;
    public evtg b = emptyProtobufList();
    public evtg c = emptyProtobufList();
    public evtg d = emptyProtobufList();

    static {
        auen auenVar = new auen();
        a = auenVar;
        evsn.registerDefaultInstance(auen.class, auenVar);
    }

    private auen() {
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
            return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"b", auaz.class, "c", auge.class, "d", auiu.class});
        }
        if (iOrdinal == 3) {
            return new auen();
        }
        if (iOrdinal == 4) {
            return new auem();
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
        synchronized (auen.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
