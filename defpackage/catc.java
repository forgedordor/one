package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class catc extends evsn implements evui {
    public static final catc a;
    private static volatile evuo c;
    public evtg b = evsn.emptyProtobufList();

    static {
        catc catcVar = new catc();
        a = catcVar;
        evsn.registerDefaultInstance(catc.class, catcVar);
    }

    private catc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new catc();
        }
        if (iOrdinal == 4) {
            return new catb();
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
        synchronized (catc.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
