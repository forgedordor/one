package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elhv extends evsn implements evui {
    public static final elhv a;
    private static volatile evuo l;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;

    static {
        elhv elhvVar = new elhv();
        a = elhvVar;
        evsn.registerDefaultInstance(elhv.class, elhvVar);
    }

    private elhv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b", new Object[]{"b", "c", "d", elvq.a, "e", "f", "g", "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new elhv();
        }
        if (iOrdinal == 4) {
            return new elhu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elhv.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
