package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sql extends evsn implements evui {
    public static final sql a;
    private static volatile evuo e;
    public evtg b = emptyProtobufList();
    public String c = "";
    public float d;

    static {
        sql sqlVar = new sql();
        a = sqlVar;
        evsn.registerDefaultInstance(sql.class, sqlVar);
    }

    private sql() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003Ȉ\u0004\u0001", new Object[]{"b", sqk.class, "c", "d"});
        }
        if (iOrdinal == 3) {
            return new sql();
        }
        if (iOrdinal == 4) {
            return new sqg();
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
        synchronized (sql.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
