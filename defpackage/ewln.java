package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewln extends evsn implements evui {
    public static final ewln a;
    private static volatile evuo c;
    public evtg b = evsn.emptyProtobufList();

    static {
        ewln ewlnVar = new ewln();
        a = ewlnVar;
        evsn.registerDefaultInstance(ewln.class, ewlnVar);
    }

    private ewln() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ewln();
        }
        if (iOrdinal == 4) {
            return new ewlm();
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
        synchronized (ewln.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
