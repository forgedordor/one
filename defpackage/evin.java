package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evin extends evsn implements evui {
    public static final evin a;
    private static volatile evuo d;
    public String b;
    public evim c;
    private int e;

    static {
        evin evinVar = new evin();
        a = evinVar;
        evsn.registerDefaultInstance(evin.class, evinVar);
    }

    private evin() {
        emptyProtobufList();
        this.b = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\f\r\u0002\u0000\u0000\u0000\fဈ\n\rဉ\u000b", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new evin();
        }
        if (iOrdinal == 4) {
            return new evik();
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
        synchronized (evin.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
