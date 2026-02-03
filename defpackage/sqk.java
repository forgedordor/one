package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqk extends evsn implements evui {
    public static final sqk a;
    private static volatile evuo f;
    public long c;
    public int e;
    public String b = "";
    public evtg d = emptyProtobufList();

    static {
        sqk sqkVar = new sqk();
        a = sqkVar;
        evsn.registerDefaultInstance(sqk.class, sqkVar);
    }

    private sqk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003\u001b\u0005\f", new Object[]{"b", "c", "d", sqj.class, "e"});
        }
        if (iOrdinal == 3) {
            return new sqk();
        }
        if (iOrdinal == 4) {
            return new sqh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (sqk.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
