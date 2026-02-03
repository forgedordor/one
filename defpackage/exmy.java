package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exmy extends evsn implements evui {
    public static final exmy a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public evtg d = emptyProtobufList();

    static {
        exmy exmyVar = new exmy();
        a = exmyVar;
        evsn.registerDefaultInstance(exmy.class, exmyVar);
    }

    private exmy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"b", "c", "d", evqe.class});
        }
        if (iOrdinal == 3) {
            return new exmy();
        }
        if (iOrdinal == 4) {
            return new exmx();
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
        synchronized (exmy.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
