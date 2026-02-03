package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feei extends evsn implements evui {
    public static final feei a;
    private static volatile evuo z;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;

    static {
        feei feeiVar = new feei();
        a = feeiVar;
        evsn.registerDefaultInstance(feei.class, feeiVar);
    }

    private feei() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0017\u0000\u0001\u0001\u0018\u0017\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0007\bင\b\tင\t\nင\n\u000bင\u000b\fင\f\rင\r\u000eင\u000e\u000fင\u000f\u0010င\u0010\u0011င\u0011\u0012င\u0012\u0014ဂ\u0013\u0015ဂ\u0014\u0016ဂ\u0015\u0017ဂ\u0016\u0018ဂ\u0017", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"});
        }
        if (iOrdinal == 3) {
            return new feei();
        }
        if (iOrdinal == 4) {
            return new feeh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = z;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (feei.class) {
            evsgVar = z;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                z = evsgVar;
            }
        }
        return evsgVar;
    }
}
