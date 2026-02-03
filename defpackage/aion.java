package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aion extends evsn implements evui {
    public static final aion a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        aion aionVar = new aion();
        a = aionVar;
        evsn.registerDefaultInstance(aion.class, aionVar);
    }

    private aion() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aiol.class});
        }
        if (iOrdinal == 3) {
            return new aion();
        }
        if (iOrdinal == 4) {
            return new aiom();
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
        synchronized (aion.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
