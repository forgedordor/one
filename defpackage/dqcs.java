package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqcs extends evsn implements evui {
    public static final dqcs a;
    private static volatile evuo f;
    public int b;
    public int c;
    public evtg d = emptyProtobufList();
    public dqck e;

    static {
        dqcs dqcsVar = new dqcs();
        a = dqcsVar;
        evsn.registerDefaultInstance(dqcs.class, dqcsVar);
    }

    private dqcs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"b", "c", "d", dqci.class, "e"});
        }
        if (iOrdinal == 3) {
            return new dqcs();
        }
        if (iOrdinal == 4) {
            return new dqcr();
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
        synchronized (dqcs.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
