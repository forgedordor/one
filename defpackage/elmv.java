package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elmv extends evsn implements evui {
    public static final elmv a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public long f;

    static {
        elmv elmvVar = new elmv();
        a = elmvVar;
        evsn.registerDefaultInstance(elmv.class, elmvVar);
    }

    private elmv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", elmu.a, "d", elmt.a, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new elmv();
        }
        if (iOrdinal == 4) {
            return new elms();
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
        synchronized (elmv.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
