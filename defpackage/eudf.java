package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudf extends evsn implements evui {
    public static final evsy a = new eudd();
    public static final eudf b;
    private static volatile evuo f;
    public int c;
    public evrw d;
    public evsx e = emptyIntList();

    static {
        eudf eudfVar = new eudf();
        b = eudfVar;
        evsn.registerDefaultInstance(eudf.class, eudfVar);
    }

    private eudf() {
        emptyIntList();
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0003,", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eudf();
        }
        if (iOrdinal == 4) {
            return new eude();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eudf.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
