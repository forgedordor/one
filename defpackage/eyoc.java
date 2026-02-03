package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyoc extends evsn implements evui {
    public static final eyoc a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        eyoc eyocVar = new eyoc();
        a = eyocVar;
        evsn.registerDefaultInstance(eyoc.class, eyocVar);
    }

    private eyoc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eypt.class});
        }
        if (iOrdinal == 3) {
            return new eyoc();
        }
        if (iOrdinal == 4) {
            return new eyob();
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
        synchronized (eyoc.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
