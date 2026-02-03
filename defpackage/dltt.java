package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dltt extends evsn implements evui {
    public static final dltt a;
    private static volatile evuo j;
    public int b;
    public Object d;
    public long g;
    public evvp i;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        dltt dlttVar = new dltt();
        a = dlttVar;
        evsn.registerDefaultInstance(dltt.class, dlttVar);
    }

    private dltt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001È\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဂ\u0002\u0004ለ\u0003\u0005ဉ\u0004È<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", dlts.class});
        }
        if (iOrdinal == 3) {
            return new dltt();
        }
        if (iOrdinal == 4) {
            return new dltp();
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
        synchronized (dltt.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
