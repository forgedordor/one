package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewoq extends evsn implements evui {
    public static final ewoq a;
    private static volatile evuo k;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public ewru i;
    public boolean j;

    static {
        ewoq ewoqVar = new ewoq();
        a = ewoqVar;
        evsn.registerDefaultInstance(ewoq.class, ewoqVar);
    }

    private ewoq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0006᠌\u0005\bဇ\u0007\t᠌\b\n᠌\t\u000bဉ\n\fဇ\u000b", new Object[]{"b", "c", ewop.a, "d", "e", ewoo.a, "f", "g", ewrh.a, "h", ewrr.a, "i", "j"});
        }
        if (iOrdinal == 3) {
            return new ewoq();
        }
        if (iOrdinal == 4) {
            return new ewon();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewoq.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
