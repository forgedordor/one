package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzwv extends evsn implements evui {
    public static final dzwv a;
    public static final evsl b;
    private static volatile evuo k;
    public int c;
    public boolean e;
    public boolean i;
    public String d = "";
    public String f = "";
    public String g = "";
    public evsx h = emptyIntList();
    public evtg j = evsn.emptyProtobufList();

    static {
        dzwv dzwvVar = new dzwv();
        a = dzwvVar;
        evsn.registerDefaultInstance(dzwv.class, dzwvVar);
        b = evsn.newSingularGeneratedExtension(dzwk.a, dzwvVar, dzwvVar, null, 334728578, evwh.MESSAGE, dzwv.class);
    }

    private dzwv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006'\u0007ဇ\u0004\b\u001a", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new dzwv();
        }
        if (iOrdinal == 4) {
            return new dzwu();
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
        synchronized (dzwv.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
