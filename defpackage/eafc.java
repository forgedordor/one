package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eafc extends evsn implements evui {
    public static final eafc a;
    private static volatile evuo h;
    public int b;
    public long f;
    public String c = "";
    public evqs d = evqs.b;
    public String e = "";
    public evtg g = emptyProtobufList();

    static {
        eafc eafcVar = new eafc();
        a = eafcVar;
        evsn.registerDefaultInstance(eafc.class, eafcVar);
    }

    private eafc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", eafe.class});
        }
        if (iOrdinal == 3) {
            return new eafc();
        }
        if (iOrdinal == 4) {
            return new eafb();
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
        synchronized (eafc.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
