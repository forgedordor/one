package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cirg extends evsn implements evui {
    public static final cirg a;
    private static volatile evuo g;
    public String b = "";
    public evtg c = evsn.emptyProtobufList();
    public int d;
    public int e;
    public int f;

    static {
        cirg cirgVar = new cirg();
        a = cirgVar;
        evsn.registerDefaultInstance(cirg.class, cirgVar);
    }

    private cirg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\f\u0004\u000b\u0005\u000b", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new cirg();
        }
        if (iOrdinal == 4) {
            return new cirf();
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
        synchronized (cirg.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
