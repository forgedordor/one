package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvr extends evsn implements evui {
    public static final dbvr a;
    private static volatile evuo e;
    public int b;
    public evtg c = emptyProtobufList();
    public evtg d;
    private int f;

    static {
        dbvr dbvrVar = new dbvr();
        a = dbvrVar;
        evsn.registerDefaultInstance(dbvr.class, dbvrVar);
    }

    private dbvr() {
        emptyProtobufList();
        this.d = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0004\u001b", new Object[]{"f", "b", dbvp.a, "c", dbvh.class, "d", dbvo.class});
        }
        if (iOrdinal == 3) {
            return new dbvr();
        }
        if (iOrdinal == 4) {
            return new dbvk();
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
        synchronized (dbvr.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
