package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euul extends evsn implements evui {
    public static final euul a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        euul euulVar = new euul();
        a = euulVar;
        evsn.registerDefaultInstance(euul.class, euulVar);
    }

    private euul() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", euuk.class});
        }
        if (iOrdinal == 3) {
            return new euul();
        }
        if (iOrdinal == 4) {
            return new euui();
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
        synchronized (euul.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
