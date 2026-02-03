package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auce extends evsn implements evui {
    public static final auce a;
    private static volatile evuo k;
    public int b;
    public aubq f;
    public aueb i;
    public auib j;
    public String c = "";
    public String d = "";
    public String e = "";
    public evtg g = emptyProtobufList();
    public evqs h = evqs.b;

    static {
        auce auceVar = new auce();
        a = auceVar;
        evsn.registerDefaultInstance(auce.class, auceVar);
    }

    private auce() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004\u001b\u0005ည\u0004\u0006ဉ\u0005\u0007ဈ\u0002\bဉ\u0006", new Object[]{"b", "c", "d", "f", "g", aubq.class, "h", "i", "e", "j"});
        }
        if (iOrdinal == 3) {
            return new auce();
        }
        if (iOrdinal == 4) {
            return new aucd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (auce.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
