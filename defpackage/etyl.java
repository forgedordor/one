package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etyl extends evsn implements evui {
    public static final etyl a;
    private static volatile evuo e;
    public int b;
    public etzd c;
    public etyj d;

    static {
        etyl etylVar = new etyl();
        a = etylVar;
        evsn.registerDefaultInstance(etyl.class, etylVar);
    }

    private etyl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new etyl();
        }
        if (iOrdinal == 4) {
            return new etyk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etyl.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
