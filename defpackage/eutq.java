package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eutq extends evsn implements evui {
    public static final eutq a;
    private static volatile evuo j;
    public int b;
    public boolean c;
    public int f;
    public evvp h;
    public evvp i;
    public evtg d = emptyProtobufList();
    public evtg e = evsn.emptyProtobufList();
    public evtg g = emptyProtobufList();

    static {
        eutq eutqVar = new eutq();
        a = eutqVar;
        evsn.registerDefaultInstance(eutq.class, eutqVar);
    }

    private eutq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဇ\u0000\u0002\u001b\u0003Ț\u0004\f\u0005\u001b\u0006ဉ\u0001\u0007ဉ\u0002", new Object[]{"b", "c", "d", eutm.class, "e", "f", "g", eutp.class, "h", "i"});
        }
        if (iOrdinal == 3) {
            return new eutq();
        }
        if (iOrdinal == 4) {
            return new euti();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eutq.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
