package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epbe extends evsn implements evui {
    public static final epbe a;
    private static volatile evuo p;
    public int b;
    public int c;
    public String d = "";
    public String e;
    public long f;
    public epdo g;
    public evqs h;
    public boolean i;
    public String j;
    public boolean k;
    public evqs l;
    public evqs m;
    public long n;
    public String o;

    static {
        epbe epbeVar = new epbe();
        a = epbeVar;
        evsn.registerDefaultInstance(epbe.class, epbeVar);
    }

    private epbe() {
        evqs evqsVar = evqs.b;
        this.e = "";
        evqs evqsVar2 = evqs.b;
        this.h = evqsVar2;
        this.j = "";
        this.l = evqsVar2;
        this.m = evqsVar2;
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
            return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0004Ȉ\u0005\u0002\u0006ဉ\u0000\u0007\n\b\u0007\tȈ\n\u0007\u000b\n\f\n\r\u0002\u000eȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        }
        if (iOrdinal == 3) {
            return new epbe();
        }
        if (iOrdinal == 4) {
            return new epbc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = p;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epbe.class) {
            evsgVar = p;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                p = evsgVar;
            }
        }
        return evsgVar;
    }
}
