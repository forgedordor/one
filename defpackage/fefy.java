package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fefy extends evsn implements evui {
    public static final fefy a;
    private static volatile evuo x;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public int s;
    public boolean t;
    public feft u;
    public feft v;
    public evub w = evub.a;

    static {
        fefy fefyVar = new fefy();
        a = fefyVar;
        evsn.registerDefaultInstance(fefy.class, fefyVar);
    }

    private fefy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001\u0019\u0015\u0001\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0004\u0004ဂ\u0007\u0005ဂ\t\tဂ\n\nဂ\u000f\u000bဇ\u0010\fဉ\u0013\rဉ\u0014\u000eဂ\u0001\u000fဂ\u0002\u00102\u0011ဂ\u0005\u0012ဂ\b\u0013ဂ\u0006\u0014ဂ\u000b\u0015ဂ\f\u0016᠌\u0011\u0017ဂ\r\u0018ဂ\u000e\u0019ဇ\u0012", new Object[]{"b", "c", "f", "i", "k", "l", "q", "r", "u", "v", "d", "e", "w", fefv.a, "g", "j", "h", "m", "n", "s", fefw.a, "o", "p", "t"});
        }
        if (iOrdinal == 3) {
            return new fefy();
        }
        if (iOrdinal == 4) {
            return new fefu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = x;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (fefy.class) {
            evsgVar = x;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                x = evsgVar;
            }
        }
        return evsgVar;
    }
}
