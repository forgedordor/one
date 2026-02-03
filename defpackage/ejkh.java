package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejkh extends evsn implements evui {
    public static final ejkh a;
    private static volatile evuo f;
    public evtg b = evsn.emptyProtobufList();
    public evtg c = evsn.emptyProtobufList();
    public evtg d = evsn.emptyProtobufList();
    public evtg e = evsn.emptyProtobufList();

    static {
        ejkh ejkhVar = new ejkh();
        a = ejkhVar;
        evsn.registerDefaultInstance(ejkh.class, ejkhVar);
    }

    private ejkh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001a\u0002\u001a\u0003\u001a\u0004\u001a", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ejkh();
        }
        if (iOrdinal == 4) {
            return new ejkg();
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
        synchronized (ejkh.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
