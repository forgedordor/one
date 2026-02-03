package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbkj extends evsn implements evui {
    public static final dbkj a;
    private static volatile evuo n;
    public Object c;
    public int e;
    public int b = 0;
    public String d = "";
    public evtg f = evsn.emptyProtobufList();
    public evsx g = emptyIntList();
    public evsx h = emptyIntList();
    public evsx i = emptyIntList();
    public evta j = emptyLongList();
    public evsw k = emptyFloatList();
    public evss l = emptyDoubleList();
    public evsr m = emptyBooleanList();

    static {
        dbkj dbkjVar = new dbkj();
        a = dbkjVar;
        evsn.registerDefaultInstance(dbkj.class, dbkjVar);
    }

    private dbkj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0012\u0001\u0000\u0001\u0012\u0012\u0000\b\u0000\u0001Ȉ\u0002\f\u0003Ȼ\u0000\u00047\u0000\u00057\u0000\u00067\u0000\u00075\u0000\b4\u0000\t3\u0000\n:\u0000\u000bȚ\f'\r'\u000e'\u000f%\u0010$\u0011#\u0012*", new Object[]{"c", "b", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new dbkj();
        }
        if (iOrdinal == 4) {
            return new dbkh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = n;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (dbkj.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}
