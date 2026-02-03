package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epao extends evsn implements evui {
    public static final epao a;
    private static volatile evuo c;
    public evtg b = evsn.emptyProtobufList();

    static {
        epao epaoVar = new epao();
        a = epaoVar;
        evsn.registerDefaultInstance(epao.class, epaoVar);
    }

    private epao() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new epao();
        }
        if (iOrdinal == 4) {
            return new epan();
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
        synchronized (epao.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
