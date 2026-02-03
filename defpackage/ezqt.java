package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezqt extends evsn implements evui {
    public static final ezqt a;
    private static volatile evuo g;
    public int b;
    public ezpp c;
    public ezol d;
    public ezot e;
    public int f;
    private ezoz h;

    static {
        ezqt ezqtVar = new ezqt();
        a = ezqtVar;
        evsn.registerDefaultInstance(ezqt.class, ezqtVar);
    }

    private ezqt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006\f", new Object[]{"b", "c", "d", "h", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ezqt();
        }
        if (iOrdinal == 4) {
            return new ezqs();
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
        synchronized (ezqt.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
