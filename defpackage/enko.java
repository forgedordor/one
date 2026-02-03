package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enko extends evsn implements evui {
    public static final enko a;
    public static final evsl b;
    private static volatile evuo g;
    public int c;
    public enku d;
    public emxg e;
    public enkq f;

    static {
        enko enkoVar = new enko();
        a = enkoVar;
        evsn.registerDefaultInstance(enko.class, enkoVar);
        b = evsn.newSingularGeneratedExtension(emkw.a, enkoVar, enkoVar, null, 216, evwh.MESSAGE, enko.class);
    }

    private enko() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0004\u0007\u0003\u0000\u0000\u0000\u0004ဉ\u0003\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new enko();
        }
        if (iOrdinal == 4) {
            return new enkn();
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
        synchronized (enko.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
