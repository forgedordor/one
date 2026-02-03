package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfyv extends evsn implements evui {
    public static final cfyv a;
    private static volatile evuo q;
    public int b;
    public ezol c;
    public int d;
    public String e = "";
    public evqs f;
    public int g;
    public boolean h;
    public int i;
    public long j;
    public String k;
    public ezol l;
    public evqs m;
    public boolean n;
    public String o;
    public boolean p;

    static {
        cfyv cfyvVar = new cfyv();
        a = cfyvVar;
        evsn.registerDefaultInstance(cfyv.class, cfyvVar);
    }

    private cfyv() {
        evqs evqsVar = evqs.b;
        this.f = evqsVar;
        this.k = "";
        this.m = evqsVar;
        this.o = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003Ȉ\u0004\n\u0005\f\u0006\u0007\u0007\u0004\b\u0002\tȈ\nဉ\u0001\u000bည\u0002\fဇ\u0003\rለ\u0004\u000eဇ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (iOrdinal == 3) {
            return new cfyv();
        }
        if (iOrdinal == 4) {
            return new cfyu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = q;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cfyv.class) {
            evsgVar = q;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                q = evsgVar;
            }
        }
        return evsgVar;
    }
}
