package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewsp extends evsn implements evui {
    public static final ewsp a;
    private static volatile evuo f;
    public String b = "";
    public evtg c = emptyProtobufList();
    public long d;
    public int e;

    static {
        ewsp ewspVar = new ewsp();
        a = ewspVar;
        evsn.registerDefaultInstance(ewsp.class, ewspVar);
    }

    private ewsp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0003\u0004\f", new Object[]{"b", "c", ewsg.class, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ewsp();
        }
        if (iOrdinal == 4) {
            return new ewsn();
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
        synchronized (ewsp.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
