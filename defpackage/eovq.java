package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eovq extends evsn implements evui {
    public static final eovq a;
    private static volatile evuo v;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;

    static {
        eovq eovqVar = new eovq();
        a = eovqVar;
        evsn.registerDefaultInstance(eovq.class, eovqVar);
    }

    private eovq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0000\u0000\u0001\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0007\u0013\u0007\u0014ဇ\u0000\u0015\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"});
        }
        if (iOrdinal == 3) {
            return new eovq();
        }
        if (iOrdinal == 4) {
            return new eovp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = v;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eovq.class) {
            evsgVar = v;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                v = evsgVar;
            }
        }
        return evsgVar;
    }
}
