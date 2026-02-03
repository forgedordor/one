package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avlb extends evsn implements evui {
    public static final avlb a;
    private static volatile evuo f;
    public int b;
    public evta c = emptyLongList();
    public evtg d = emptyProtobufList();
    public int e;

    static {
        avlb avlbVar = new avlb();
        a = avlbVar;
        evsn.registerDefaultInstance(avlb.class, avlbVar);
    }

    private avlb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001%\u0002\u001b\u0003ဌ\u0000", new Object[]{"b", "c", "d", avkq.class, "e"});
        }
        if (iOrdinal == 3) {
            return new avlb();
        }
        if (iOrdinal == 4) {
            return new avla();
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
        synchronized (avlb.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
