package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euur extends evsn implements evui {
    public static final euur a;
    private static volatile evuo j;
    public int b;
    public String c = "";
    public evtg d = evsn.emptyProtobufList();
    public evtg e = evsn.emptyProtobufList();
    public evtg f = evsn.emptyProtobufList();
    public evtg g = evsn.emptyProtobufList();
    public euuq h;
    public int i;

    static {
        euur euurVar = new euur();
        a = euurVar;
        evsn.registerDefaultInstance(euur.class, euurVar);
    }

    private euur() {
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\t\u0007\u0000\u0004\u0000\u0001Ȉ\u0003Ț\u0004Ț\u0005Ț\u0006Ț\bဉ\u0000\t\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new euur();
        }
        if (iOrdinal == 4) {
            return new euum();
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
        synchronized (euur.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
