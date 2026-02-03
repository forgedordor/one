package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewvx extends evsn implements evui {
    public static final ewvx a;
    public static final evsl b;
    private static volatile evuo d;
    public evtg c = evsn.emptyProtobufList();

    static {
        ewvx ewvxVar = new ewvx();
        a = ewvxVar;
        evsn.registerDefaultInstance(ewvx.class, ewvxVar);
        b = evsn.newSingularGeneratedExtension(ewvl.a, ewvxVar, ewvxVar, null, 274192245, evwh.MESSAGE, ewvx.class);
    }

    private ewvx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"c"});
        }
        if (iOrdinal == 3) {
            return new ewvx();
        }
        if (iOrdinal == 4) {
            return new ewvw();
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
        synchronized (ewvx.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
