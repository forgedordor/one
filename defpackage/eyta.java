package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyta extends evsn implements evui {
    public static final eyta a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public int c;

    static {
        eyta eytaVar = new eyta();
        a = eytaVar;
        evsn.registerDefaultInstance(eyta.class, eytaVar);
    }

    private eyta() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"b", eysz.class, "c"});
        }
        if (iOrdinal == 3) {
            return new eyta();
        }
        if (iOrdinal == 4) {
            return new eysx();
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
        synchronized (eyta.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
