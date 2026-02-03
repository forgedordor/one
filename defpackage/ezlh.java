package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezlh extends evsn implements evui {
    public static final ezlh a;
    private static volatile evuo g;
    public int b;
    public ezpr c;
    public ezns d;
    public ezpj e;
    public ezol f;

    static {
        ezlh ezlhVar = new ezlh();
        a = ezlhVar;
        evsn.registerDefaultInstance(ezlh.class, ezlhVar);
    }

    private ezlh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ezlh();
        }
        if (iOrdinal == 4) {
            return new ezlg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezlh.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
