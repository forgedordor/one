package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqs extends evsn implements evui {
    public static final ejqs a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        ejqs ejqsVar = new ejqs();
        a = ejqsVar;
        evsn.registerDefaultInstance(ejqs.class, ejqsVar);
    }

    private ejqs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", esxe.class});
        }
        if (iOrdinal == 3) {
            return new ejqs();
        }
        if (iOrdinal == 4) {
            return new ejqr();
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
        synchronized (ejqs.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
