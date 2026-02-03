package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etkl extends evsn implements evui {
    public static final etkl a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        etkl etklVar = new etkl();
        a = etklVar;
        evsn.registerDefaultInstance(etkl.class, etklVar);
    }

    private etkl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new etkl();
        }
        if (iOrdinal == 4) {
            return new etkk();
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
        synchronized (etkl.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
