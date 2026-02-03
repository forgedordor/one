package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crvi extends evsn implements evui {
    public static final crvi a;
    private static volatile evuo f;
    public int c;
    public evtg b = emptyProtobufList();
    public evtg d = emptyProtobufList();
    public evtg e = emptyProtobufList();

    static {
        crvi crviVar = new crvi();
        a = crviVar;
        evsn.registerDefaultInstance(crvi.class, crviVar);
    }

    private crvi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\f\u0003\u001b\u0004\u001b", new Object[]{"b", crul.class, "c", "d", crtk.class, "e", crtk.class});
        }
        if (iOrdinal == 3) {
            return new crvi();
        }
        if (iOrdinal == 4) {
            return new crvh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (crvi.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
