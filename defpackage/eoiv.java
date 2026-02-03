package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoiv extends evsn implements evui {
    public static final eoiv a;
    private static volatile evuo z;
    public int b;
    public int c;
    public int d;
    public eoir e;
    public long f;
    public eokj g;
    public eojh h;
    public eoit i;
    public eojz j;
    public eojf k;
    public eojt l;
    public eoip m;
    public eojp n;
    public eojd o;
    public eojv p;
    public eojn q;
    public eoix r;
    public eojb s;
    public eojj t;
    public eojl u;
    public eokh v;
    public eojx w;
    public eokb x;
    public eoiz y;

    static {
        eoiv eoivVar = new eoiv();
        a = eoivVar;
        evsn.registerDefaultInstance(eoiv.class, eoivVar);
    }

    private eoiv() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0015\u0000\u0003\nQ\u0015\u0000\u0000\u0000\nဉ\b\u0015ဂ\u0013 ဉ\u001f(ဉ'.ဉ-0ဉ/1ဉ03ဉ36ဉ6?ဉ?@ဉ@AဉABဉBCဉCEဉEGဉHHဉ\u0014KဉIMဉKPဉNQဉO", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "g", "v", "w", "x", "y"});
        }
        if (iOrdinal == 3) {
            return new eoiv();
        }
        if (iOrdinal == 4) {
            return new eoiu();
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
        synchronized (eoiv.class) {
            evsgVar = z;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                z = evsgVar;
            }
        }
        return evsgVar;
    }
}
