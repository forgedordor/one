package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epkm extends evsn implements evui {
    public static final epkm a;
    private static volatile evuo n;
    public evqs b;
    public evqs c;
    public String d;
    public long e;
    public int f;
    public String g;
    public String h;
    public evqs i;
    public int j;
    public long k;
    public long l;
    public long m;

    static {
        epkm epkmVar = new epkm();
        a = epkmVar;
        evsn.registerDefaultInstance(epkm.class, epkmVar);
    }

    private epkm() {
        evqs evqsVar = evqs.b;
        this.b = evqsVar;
        this.c = evqsVar;
        this.d = "";
        this.g = "";
        this.h = "";
        this.i = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007\n\b\f\t\u0002\n\u0002\u000b\u0002\f\n", new Object[]{"b", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "c"});
        }
        if (iOrdinal == 3) {
            return new epkm();
        }
        if (iOrdinal == 4) {
            return new epkl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = n;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epkm.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}
