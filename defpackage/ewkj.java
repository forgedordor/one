package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewkj extends evsn implements evui {
    public static final ewkj a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public ewki e;

    static {
        ewkj ewkjVar = new ewkj();
        a = ewkjVar;
        evsn.registerDefaultInstance(ewkj.class, ewkjVar);
    }

    private ewkj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", ewkg.a, "e"});
        }
        if (iOrdinal == 3) {
            return new ewkj();
        }
        if (iOrdinal == 4) {
            return new ewkf();
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
        synchronized (ewkj.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
