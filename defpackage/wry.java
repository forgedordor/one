package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wry extends evsn implements evui {
    public static final wry a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public evtg c = emptyProtobufList();

    static {
        wry wryVar = new wry();
        a = wryVar;
        evsn.registerDefaultInstance(wry.class, wryVar);
    }

    private wry() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", dlul.class, "c", wrv.class});
        }
        if (iOrdinal == 3) {
            return new wry();
        }
        if (iOrdinal == 4) {
            return new wrx();
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
        synchronized (wry.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
