package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emdz extends evsn implements evui {
    public static final emdz a;
    private static volatile evuo j;
    public int b;
    public int d;
    public int e;
    public int f;
    public boolean h;
    public int i;
    public String c = "";
    public evtg g = emptyProtobufList();

    static {
        emdz emdzVar = new emdz();
        a = emdzVar;
        evsn.registerDefaultInstance(emdz.class, emdzVar);
    }

    private emdz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005\u001b\u0006ဇ\u0004\u0007င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", emeg.class, "h", "i"});
        }
        if (iOrdinal == 3) {
            return new emdz();
        }
        if (iOrdinal == 4) {
            return new emdy();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emdz.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
