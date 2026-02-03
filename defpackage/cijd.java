package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cijd extends evsn implements evui {
    public static final cijd a;
    private static volatile evuo h;
    public long b;
    public String c = "";
    public String d = "";
    public String e = "";
    public evtg f = evsn.emptyProtobufList();
    public String g = "";

    static {
        cijd cijdVar = new cijd();
        a = cijdVar;
        evsn.registerDefaultInstance(cijd.class, cijdVar);
    }

    private cijd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ț\u0006Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new cijd();
        }
        if (iOrdinal == 4) {
            return new cijc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cijd.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
