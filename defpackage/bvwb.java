package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvwb extends evsn implements evui {
    public static final bvwb a;
    private static volatile evuo f;
    public evtg b = emptyProtobufList();
    public evtg c = emptyProtobufList();
    public String d = "";
    public boolean e;

    static {
        bvwb bvwbVar = new bvwb();
        a = bvwbVar;
        evsn.registerDefaultInstance(bvwb.class, bvwbVar);
    }

    private bvwb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001c\u0002\u001c\u0003Ȉ\u0004\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new bvwb();
        }
        if (iOrdinal == 4) {
            return new bvwa();
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
        synchronized (bvwb.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
