package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezpz extends evsn implements evui {
    public static final ezpz a;
    private static volatile evuo e;
    public int b;
    public eyaz c;
    public eybm d;

    static {
        ezpz ezpzVar = new ezpz();
        a = ezpzVar;
        evsn.registerDefaultInstance(ezpz.class, ezpzVar);
    }

    private ezpz() {
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
            return new ezpz();
        }
        if (iOrdinal == 4) {
            return new ezpy();
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
        synchronized (ezpz.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
