package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewzm extends evsn implements evui {
    public static final ewzm a;
    private static volatile evuo e;
    public String b = "";
    public int c;
    public int d;

    static {
        ewzm ewzmVar = new ewzm();
        a = ewzmVar;
        evsn.registerDefaultInstance(ewzm.class, ewzmVar);
    }

    private ewzm() {
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
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ewzm();
        }
        if (iOrdinal == 4) {
            return new ewzl();
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
        synchronized (ewzm.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
