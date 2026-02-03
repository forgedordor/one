package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvqr extends evsn implements evui {
    public static final bvqr a;
    private static volatile evuo q;
    public int b;
    public int c;
    public evtg d;
    public bvqj e;
    public evtg f;
    public String g;
    public bvqm h;
    public long i;
    public boolean j;
    public bvqh k;
    public boolean l;
    public int m;
    public boolean n;
    public int o;
    public int p;

    static {
        bvqr bvqrVar = new bvqr();
        a = bvqrVar;
        evsn.registerDefaultInstance(bvqr.class, bvqrVar);
    }

    private bvqr() {
        evsn.emptyProtobufList();
        this.d = evsn.emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0002\u0000\u0001\f\u0005Ț\u0006ဉ\u0000\u0007\u001b\bȈ\tဉ\u0001\n\u0002\u000b\u0007\fဉ\u0002\r\u0007\u000e\u0004\u000f\u0007\u0010\u0004\u0011\u0004", new Object[]{"b", "c", "d", "e", "f", bvqj.class, "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (iOrdinal == 3) {
            return new bvqr();
        }
        if (iOrdinal == 4) {
            return new bvqp();
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
        synchronized (bvqr.class) {
            evsgVar = q;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                q = evsgVar;
            }
        }
        return evsgVar;
    }
}
