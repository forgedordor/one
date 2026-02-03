package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aith extends evsn implements evui {
    public static final aith a;
    private static volatile evuo o;
    public int b;
    public long c = -1;
    public long d = -1;
    public boolean e = true;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public long i = -1;
    public long j = -1;
    public String k;
    public evvp l;
    public evvp m;
    public long n;

    static {
        aith aithVar = new aith();
        a = aithVar;
        evsn.registerDefaultInstance(aith.class, aithVar);
    }

    private aith() {
        evsn.emptyProtobufList();
        this.k = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\u000bဈ\t\fဉ\n\rဂ\f\u000eဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "m"});
        }
        if (iOrdinal == 3) {
            return new aith();
        }
        if (iOrdinal == 4) {
            return new aitg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = o;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (aith.class) {
            evsgVar = o;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                o = evsgVar;
            }
        }
        return evsgVar;
    }
}
