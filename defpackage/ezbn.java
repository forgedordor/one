package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezbn extends evsn implements ezbo {
    public static final ezbn a;
    private static volatile evuo f;
    public int b;
    public ezpz d;
    public String c = "";
    public String e = "";

    static {
        ezbn ezbnVar = new ezbn();
        a = ezbnVar;
        evsn.registerDefaultInstance(ezbn.class, ezbnVar);
    }

    private ezbn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ezbn();
        }
        if (iOrdinal == 4) {
            return new ezbm();
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
        synchronized (ezbn.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
