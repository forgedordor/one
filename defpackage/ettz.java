package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ettz extends evsn implements evui {
    public static final ettz a;
    private static volatile evuo d;
    public String b = "";
    public evtg c = emptyProtobufList();
    private int e;

    static {
        ettz ettzVar = new ettz();
        a = ettzVar;
        evsn.registerDefaultInstance(ettz.class, ettzVar);
    }

    private ettz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"e", "b", "c", etuf.class});
        }
        if (iOrdinal == 3) {
            return new ettz();
        }
        if (iOrdinal == 4) {
            return new etty();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ettz.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
