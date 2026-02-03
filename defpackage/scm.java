package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scm extends evsn implements evui {
    public static final scm a;
    private static volatile evuo d;
    public evss b = emptyDoubleList();
    public evtg c = evsn.emptyProtobufList();

    static {
        scm scmVar = new scm();
        a = scmVar;
        evsn.registerDefaultInstance(scm.class, scmVar);
    }

    private scm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u0012\u0002\u001a", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new scm();
        }
        if (iOrdinal == 4) {
            return new scl();
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
        synchronized (scm.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
