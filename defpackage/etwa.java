package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etwa extends evsn implements evui {
    public static final etwa a;
    private static volatile evuo h;
    public boolean d;
    public etvy f;
    private int i;
    public String b = "";
    public String c = "";
    public String e = "";
    public evtg g = emptyProtobufList();

    static {
        etwa etwaVar = new etwa();
        a = etwaVar;
        evsn.registerDefaultInstance(etwa.class, etwaVar);
    }

    private etwa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006\u001b", new Object[]{"i", "b", "c", "d", "e", "f", "g", etxg.class});
        }
        if (iOrdinal == 3) {
            return new etwa();
        }
        if (iOrdinal == 4) {
            return new etvz();
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
        synchronized (etwa.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
