package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsj extends evsn implements evui {
    public static final etsj a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public evsx c = emptyIntList();

    static {
        etsj etsjVar = new etsj();
        a = etsjVar;
        evsn.registerDefaultInstance(etsj.class, etsjVar);
    }

    private etsj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002+", new Object[]{"b", etsc.class, "c"});
        }
        if (iOrdinal == 3) {
            return new etsj();
        }
        if (iOrdinal == 4) {
            return new etsi();
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
        synchronized (etsj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
