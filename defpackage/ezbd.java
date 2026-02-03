package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezbd extends evsn implements evui {
    public static final ezbd a;
    private static volatile evuo g;
    public int b;
    public ezev c;
    public ezer d;
    public ezet e;
    public ezha f;

    static {
        ezbd ezbdVar = new ezbd();
        a = ezbdVar;
        evsn.registerDefaultInstance(ezbd.class, ezbdVar);
    }

    private ezbd() {
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
            return new ezbd();
        }
        if (iOrdinal == 4) {
            return new ezbc();
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
        synchronized (ezbd.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
