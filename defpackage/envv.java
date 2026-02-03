package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class envv extends evsn implements evui {
    public static final envv a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public boolean e;

    static {
        envv envvVar = new envv();
        a = envvVar;
        evsn.registerDefaultInstance(envv.class, envvVar);
    }

    private envv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002", new Object[]{"b", "c", envu.a, "d", envt.a, "e"});
        }
        if (iOrdinal == 3) {
            return new envv();
        }
        if (iOrdinal == 4) {
            return new envs();
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
        synchronized (envv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
