package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezlt extends evsn implements evui {
    public static final ezlt a;
    private static volatile evuo h;
    public ezpl b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    private int i;

    static {
        ezlt ezltVar = new ezlt();
        a = ezltVar;
        evsn.registerDefaultInstance(ezlt.class, ezltVar);
    }

    private ezlt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ezlt();
        }
        if (iOrdinal == 4) {
            return new ezls();
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
        synchronized (ezlt.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
