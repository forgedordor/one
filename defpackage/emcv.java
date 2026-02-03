package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emcv extends evsn implements evui {
    public static final emcv a;
    private static volatile evuo v;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    static {
        emcv emcvVar = new emcv();
        a = emcvVar;
        evsn.registerDefaultInstance(emcv.class, emcvVar);
    }

    private emcv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\t\nဂ\n\u000bဋ\u000b\fဋ\f\rဋ\r\u000eဋ\u000e\u000fဋ\u000f\u0010ဋ\u0010\u0011ဋ\u0011\u0012ဋ\u0012\u0013ဂ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "k"});
        }
        if (iOrdinal == 3) {
            return new emcv();
        }
        if (iOrdinal == 4) {
            return new emcu();
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
        synchronized (emcv.class) {
            evsgVar = v;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                v = evsgVar;
            }
        }
        return evsgVar;
    }
}
