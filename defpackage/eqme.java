package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqme extends evsn implements evui {
    public static final eqme a;
    private static volatile evuo h;
    public int b;
    public eqny c;
    public evvp d;
    public evtg e = evsn.emptyProtobufList();
    public String f = "";
    public boolean g;
    private int i;

    static {
        eqme eqmeVar = new eqme();
        a = eqmeVar;
        evsn.registerDefaultInstance(eqme.class, eqmeVar);
    }

    private eqme() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001ϧ\u0006\u0000\u0001\u0000\u0001ဉ\u0001\u0004Ț\u0005\u0004\u0006Ȉ\u0007\u0007ϧဉ\u0000", new Object[]{"b", "d", "e", "i", "f", "g", "c"});
        }
        if (iOrdinal == 3) {
            return new eqme();
        }
        if (iOrdinal == 4) {
            return new eqmd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eqme.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
