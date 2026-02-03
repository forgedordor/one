package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enys extends evsn implements evui {
    public static final enys a;
    private static volatile evuo j;
    public int b;
    public int c;
    public enyr d;
    public enym e;
    public enym f;
    public enyo g;
    public enyo h;
    public enym i;

    static {
        enys enysVar = new enys();
        a = enysVar;
        evsn.registerDefaultInstance(enys.class, enysVar);
    }

    private enys() {
        emptyProtobufList();
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
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0013\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0005ဉ\u0002\u000bဉ\b\u0010ဉ\r\u0011ဉ\u000e\u0012ဉ\u000f\u0013ဉ\u0010", new Object[]{"b", "c", enyj.a, "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new enys();
        }
        if (iOrdinal == 4) {
            return new enyi();
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
        synchronized (enys.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
