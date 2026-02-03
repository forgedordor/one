package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqi extends evsn implements evui {
    public static final ceqi a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        ceqi ceqiVar = new ceqi();
        a = ceqiVar;
        evsn.registerDefaultInstance(ceqi.class, ceqiVar);
    }

    private ceqi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ceqk.class});
        }
        if (iOrdinal == 3) {
            return new ceqi();
        }
        if (iOrdinal == 4) {
            return new ceqh();
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
        synchronized (ceqi.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
