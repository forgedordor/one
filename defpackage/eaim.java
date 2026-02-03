package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaim extends evsn implements evui {
    public static final eaim a;
    private static volatile evuo f;
    public eahz b;
    public int c;
    public long d;
    public int e;
    private int g;

    static {
        eaim eaimVar = new eaim();
        a = eaimVar;
        evsn.registerDefaultInstance(eaim.class, eaimVar);
    }

    private eaim() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဌ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eaim();
        }
        if (iOrdinal == 4) {
            return new eail();
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
        synchronized (eaim.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
