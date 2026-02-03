package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqf extends evsn implements evui {
    public static final sqf a;
    private static volatile evuo e;
    public int c;
    public String b = "";
    public evtg d = evsn.emptyProtobufList();

    static {
        sqf sqfVar = new sqf();
        a = sqfVar;
        evsn.registerDefaultInstance(sqf.class, sqfVar);
    }

    private sqf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0001\u0000\u0001Ȉ\n\f\u000bȚ", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new sqf();
        }
        if (iOrdinal == 4) {
            return new sqe();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (sqf.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
