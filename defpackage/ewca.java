package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewca extends evsn implements evui {
    public static final ewca a;
    private static volatile evuo d;
    public evtg b = emptyProtobufList();
    public evtg c = emptyProtobufList();

    static {
        ewca ewcaVar = new ewca();
        a = ewcaVar;
        evsn.registerDefaultInstance(ewca.class, ewcaVar);
    }

    private ewca() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", evzo.class, "c", evzo.class});
        }
        if (iOrdinal == 3) {
            return new ewca();
        }
        if (iOrdinal == 4) {
            return new ewbz();
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
        synchronized (ewca.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
