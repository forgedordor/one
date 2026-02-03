package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eutd extends evsn implements evui {
    public static final eutd a;
    private static volatile evuo e;
    public String b = "";
    public String c = "";
    public evtg d = evsn.emptyProtobufList();

    static {
        eutd eutdVar = new eutd();
        a = eutdVar;
        evsn.registerDefaultInstance(eutd.class, eutdVar);
    }

    private eutd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eutd();
        }
        if (iOrdinal == 4) {
            return new eutc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eutd.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
