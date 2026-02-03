package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezkh extends evsn implements evui {
    public static final ezkh a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public boolean c;

    static {
        ezkh ezkhVar = new ezkh();
        a = ezkhVar;
        evsn.registerDefaultInstance(ezkh.class, ezkhVar);
    }

    private ezkh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003\u0007", new Object[]{"b", ezjj.class, "c"});
        }
        if (iOrdinal == 3) {
            return new ezkh();
        }
        if (iOrdinal == 4) {
            return new ezkg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezkh.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
