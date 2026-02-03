package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqoo extends evsn implements evui {
    public static final eqoo a;
    private static volatile evuo g;
    public int b;
    public eqny c;
    public String d = "";
    public eqnu e;
    public evrw f;

    static {
        eqoo eqooVar = new eqoo();
        a = eqooVar;
        evsn.registerDefaultInstance(eqoo.class, eqooVar);
    }

    private eqoo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0001\u0003ဉ\u0002ϧဉ\u0000", new Object[]{"b", "d", "e", "f", "c"});
        }
        if (iOrdinal == 3) {
            return new eqoo();
        }
        if (iOrdinal == 4) {
            return new eqon();
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
        synchronized (eqoo.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
