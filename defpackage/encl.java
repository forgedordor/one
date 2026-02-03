package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class encl extends evsn implements evui {
    public static final encl a;
    private static volatile evuo h;
    public int b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public long g;

    static {
        encl enclVar = new encl();
        a = enclVar;
        evsn.registerDefaultInstance(encl.class, enclVar);
    }

    private encl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"b", "c", alwj.a, "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new encl();
        }
        if (iOrdinal == 4) {
            return new enck();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (encl.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
