package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyna extends evsn implements evui {
    public static final eyna a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public String c = "";

    static {
        eyna eynaVar = new eyna();
        a = eynaVar;
        evsn.registerDefaultInstance(eyna.class, eynaVar);
    }

    private eyna() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003Ȉ", new Object[]{"b", eyph.class, "c"});
        }
        if (iOrdinal == 3) {
            return new eyna();
        }
        if (iOrdinal == 4) {
            return new eymz();
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
        synchronized (eyna.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
