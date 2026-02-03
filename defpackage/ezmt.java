package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezmt extends evsn implements evui {
    public static final ezmt a;
    private static volatile evuo g;
    public int b;
    public ezpr c;
    public evqs d = evqs.b;
    public ezhm e;
    public ezns f;

    static {
        ezmt ezmtVar = new ezmt();
        a = ezmtVar;
        evsn.registerDefaultInstance(ezmt.class, ezmtVar);
    }

    private ezmt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ezmt();
        }
        if (iOrdinal == 4) {
            return new ezms();
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
        synchronized (ezmt.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
