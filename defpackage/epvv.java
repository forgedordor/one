package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epvv extends evsn implements evui {
    public static final epvv a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        epvv epvvVar = new epvv();
        a = epvvVar;
        evsn.registerDefaultInstance(epvv.class, epvvVar);
    }

    private epvv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001c", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new epvv();
        }
        if (iOrdinal == 4) {
            return new epvu();
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
        synchronized (epvv.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
