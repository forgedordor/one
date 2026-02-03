package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbou extends evsn implements evui {
    public static final cbou a;
    private static volatile evuo c;
    public cayp b;
    private int d;

    static {
        cbou cbouVar = new cbou();
        a = cbouVar;
        evsn.registerDefaultInstance(cbou.class, cbouVar);
    }

    private cbou() {
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new cbou();
        }
        if (iOrdinal == 4) {
            return new cbot();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cbou.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
