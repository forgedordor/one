package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwve extends evsn implements evui {
    public static final bwve a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        bwve bwveVar = new bwve();
        a = bwveVar;
        evsn.registerDefaultInstance(bwve.class, bwveVar);
    }

    private bwve() {
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
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aubq.class});
        }
        if (iOrdinal == 3) {
            return new bwve();
        }
        if (iOrdinal == 4) {
            return new bwvd();
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
        synchronized (bwve.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
