package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbqb extends evsn implements evui {
    public static final cbqb a;
    private static volatile evuo d;
    public String b = "";
    public evtg c = evsn.emptyProtobufList();

    static {
        cbqb cbqbVar = new cbqb();
        a = cbqbVar;
        evsn.registerDefaultInstance(cbqb.class, cbqbVar);
    }

    private cbqb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new cbqb();
        }
        if (iOrdinal == 4) {
            return new cbqa();
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
        synchronized (cbqb.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
