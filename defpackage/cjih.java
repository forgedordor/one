package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjih extends evsn implements evui {
    public static final cjih a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    static {
        cjih cjihVar = new cjih();
        a = cjihVar;
        evsn.registerDefaultInstance(cjih.class, cjihVar);
    }

    private cjih() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", cjif.a, "d", cjid.a, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new cjih();
        }
        if (iOrdinal == 4) {
            return new cjic();
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
        synchronized (cjih.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
