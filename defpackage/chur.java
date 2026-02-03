package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chur extends evsn implements evui {
    public static final chur a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        chur churVar = new chur();
        a = churVar;
        evsn.registerDefaultInstance(chur.class, churVar);
    }

    private chur() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", chup.a});
        }
        if (iOrdinal == 3) {
            return new chur();
        }
        if (iOrdinal == 4) {
            return new chuq();
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
        synchronized (chur.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
