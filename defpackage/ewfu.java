package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewfu extends evsn implements evui {
    public static final ewfu a;
    private static volatile evuo r;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public int j;
    public int k;
    public String l = "";
    public long m;
    public long n;
    public boolean o;
    public ewft p;
    public long q;

    static {
        ewfu ewfuVar = new ewfu();
        a = ewfuVar;
        evsn.registerDefaultInstance(ewfu.class, ewfuVar);
    }

    private ewfu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = ewfx.a;
            evsv evsvVar2 = ewra.a;
            return newMessageInfo(a, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\b᠌\u0007\t᠌\b\nဈ\t\u000bဂ\n\fဂ\u000b\rဇ\f\u000eဉ\r\u000fဂ\u000e", new Object[]{"b", "c", evsvVar, "d", evsvVar, "e", ewfv.a, "f", ewfz.a, "g", "h", "i", "j", evsvVar2, "k", evsvVar2, "l", "m", "n", "o", "p", "q"});
        }
        if (iOrdinal == 3) {
            return new ewfu();
        }
        if (iOrdinal == 4) {
            return new ewfr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = r;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewfu.class) {
            evsgVar = r;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                r = evsgVar;
            }
        }
        return evsgVar;
    }
}
