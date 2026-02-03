package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drwe extends evsn implements evui {
    public static final drwe a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        drwe drweVar = new drwe();
        a = drweVar;
        evsn.registerDefaultInstance(drwe.class, drweVar);
    }

    private drwe() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", drwp.class});
        }
        if (iOrdinal == 3) {
            return new drwe();
        }
        if (iOrdinal == 4) {
            return new drwd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (drwe.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
