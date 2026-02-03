package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupp extends evsn implements evui {
    public static final eupp a;
    private static volatile evuo f;
    public int b;
    public int c = 5;
    public eusa d;
    public euqq e;

    static {
        eupp euppVar = new eupp();
        a = euppVar;
        evsn.registerDefaultInstance(eupp.class, euppVar);
    }

    private eupp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", euqt.a, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eupp();
        }
        if (iOrdinal == 4) {
            return new eupo();
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
        synchronized (eupp.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
