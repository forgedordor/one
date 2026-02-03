package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdh extends evsn implements evui {
    public static final ehdh a;
    private static volatile evuo j;
    public int b;
    public String c = "";
    public String d = "";
    public evqs e = evqs.b;
    public evtg f = emptyProtobufList();
    public evtg g = evsn.emptyProtobufList();
    public int h;
    public long i;

    static {
        ehdh ehdhVar = new ehdh();
        a = ehdhVar;
        evsn.registerDefaultInstance(ehdh.class, ehdhVar);
    }

    private ehdh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004\u001b\u0005\u001a\u0006ဆ\u0003\u0007စ\u0004", new Object[]{"b", "c", "d", "e", "f", ehdl.class, "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new ehdh();
        }
        if (iOrdinal == 4) {
            return new ehdg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ehdh.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
