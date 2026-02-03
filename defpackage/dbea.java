package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbea extends evsn implements evui {
    public static final dbea a;
    private static volatile evuo h;
    public Object c;
    public evvp d;
    public dbek f;
    public int g;
    private int i;
    public int b = 0;
    public String e = "";

    static {
        dbea dbeaVar = new dbea();
        a = dbeaVar;
        evsn.registerDefaultInstance(dbea.class, dbeaVar);
    }

    private dbea() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002ဉ\u0000\u0003ለ\u0001\u0004ဉ\u0002\u0005<\u0000\u0006ဌ\u0003", new Object[]{"c", "b", "i", dbee.class, "d", "e", "f", dbcz.class, "g"});
        }
        if (iOrdinal == 3) {
            return new dbea();
        }
        if (iOrdinal == 4) {
            return new dbdy();
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
        synchronized (dbea.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
