package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class famt extends evsn implements evui {
    public static final famt a;
    private static volatile evuo f;
    public evtg b = evsn.emptyProtobufList();
    public evtg c = evsn.emptyProtobufList();
    public String d = "";
    public boolean e;
    private int g;

    static {
        famt famtVar = new famt();
        a = famtVar;
        evsn.registerDefaultInstance(famt.class, famtVar);
    }

    private famt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0002\u0000\u0002Ț\u0003Ț\u0004ለ\u0001\u0005ဇ\u0002", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new famt();
        }
        if (iOrdinal == 4) {
            return new fams();
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
        synchronized (famt.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
