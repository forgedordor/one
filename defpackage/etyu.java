package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etyu extends evsn implements evui {
    public static final etyu a;
    private static volatile evuo i;
    public int c;
    public etyb d;
    public evtg h;
    private int j;
    public String b = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        etyu etyuVar = new etyu();
        a = etyuVar;
        evsn.registerDefaultInstance(etyu.class, etyuVar);
    }

    private etyu() {
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
        this.h = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u0013\u0007\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0006Ȉ\u0007Ȉ\bȈ\u0011\u001b\u0013ဉ\u0001", new Object[]{"j", "b", "c", "e", "f", "g", "h", etyp.class, "d"});
        }
        if (iOrdinal == 3) {
            return new etyu();
        }
        if (iOrdinal == 4) {
            return new etys();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etyu.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
