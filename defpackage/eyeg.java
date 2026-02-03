package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyeg extends evsn implements evui {
    public static final eyeg a;
    private static volatile evuo f;
    public int b;
    public int c;
    public eyed d;
    public eyef e;

    static {
        eyeg eyegVar = new eyeg();
        a = eyegVar;
        evsn.registerDefaultInstance(eyeg.class, eyegVar);
    }

    private eyeg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eyeg();
        }
        if (iOrdinal == 4) {
            return new eyeb();
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
        synchronized (eyeg.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
