package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aipn extends evsn implements evui {
    public static final aipn a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        aipn aipnVar = new aipn();
        a = aipnVar;
        evsn.registerDefaultInstance(aipn.class, aipnVar);
    }

    private aipn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aipl.class});
        }
        if (iOrdinal == 3) {
            return new aipn();
        }
        if (iOrdinal == 4) {
            return new aipm();
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
        synchronized (aipn.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
