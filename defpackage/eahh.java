package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eahh extends evsn implements evui {
    public static final eahh a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public evtg d = emptyProtobufList();
    public int e;

    static {
        eahh eahhVar = new eahh();
        a = eahhVar;
        evsn.registerDefaultInstance(eahh.class, eahhVar);
    }

    private eahh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ለ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"b", "c", "d", eahz.class, "e"});
        }
        if (iOrdinal == 3) {
            return new eahh();
        }
        if (iOrdinal == 4) {
            return new eahg();
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
        synchronized (eahh.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
