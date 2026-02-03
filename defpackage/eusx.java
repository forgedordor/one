package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eusx extends evsn implements evui {
    public static final eusx a;
    private static volatile evuo f;
    public int c;
    public int d;
    public String b = "";
    public evtg e = emptyProtobufList();

    static {
        eusx eusxVar = new eusx();
        a = eusxVar;
        evsn.registerDefaultInstance(eusx.class, eusxVar);
    }

    private eusx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u001b", new Object[]{"b", "c", "d", "e", eusd.class});
        }
        if (iOrdinal == 3) {
            return new eusx();
        }
        if (iOrdinal == 4) {
            return new eusw();
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
        synchronized (eusx.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
