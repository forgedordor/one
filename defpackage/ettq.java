package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ettq extends evsn implements evui {
    public static final ettq a;
    private static volatile evuo c;
    private String d = "";
    private String e = "";
    public evtg b = evsn.emptyProtobufList();

    static {
        ettq ettqVar = new ettq();
        a = ettqVar;
        evsn.registerDefaultInstance(ettq.class, ettqVar);
    }

    private ettq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț", new Object[]{"d", "e", "b"});
        }
        if (iOrdinal == 3) {
            return new ettq();
        }
        if (iOrdinal == 4) {
            return new ettp();
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
        synchronized (ettq.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
