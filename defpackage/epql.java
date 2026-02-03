package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epql extends evsn implements evui {
    public static final epql a;
    private static volatile evuo g;
    public boolean b;
    public evqs c = evqs.b;
    public String d = "";
    public String e = "";
    public evtg f = emptyProtobufList();

    static {
        epql epqlVar = new epql();
        a = epqlVar;
        evsn.registerDefaultInstance(epql.class, epqlVar);
    }

    private epql() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0007\u0002\n\u0003Ȉ\u0004Ȉ\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", epew.class});
        }
        if (iOrdinal == 3) {
            return new epql();
        }
        if (iOrdinal == 4) {
            return new epqk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epql.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
