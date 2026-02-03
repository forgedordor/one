package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caue extends evsn implements evui {
    public static final caue a;
    private static volatile evuo d;
    public evtg b = evsn.emptyProtobufList();
    public evtg c = evsn.emptyProtobufList();

    static {
        caue caueVar = new caue();
        a = caueVar;
        evsn.registerDefaultInstance(caue.class, caueVar);
    }

    private caue() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new caue();
        }
        if (iOrdinal == 4) {
            return new caud();
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
        synchronized (caue.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
