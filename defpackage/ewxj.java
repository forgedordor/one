package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewxj extends evsn implements evui {
    public static final ewxj a;
    private static volatile evuo s;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public int q;
    public boolean r;

    static {
        ewxj ewxjVar = new ewxj();
        a = ewxjVar;
        evsn.registerDefaultInstance(ewxj.class, ewxjVar);
    }

    private ewxj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0013\u0010\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nင\t\u000eင\r\u000fင\u000e\u0010ဇ\u000f\u0011င\u0010\u0012င\u0011\u0013ဇ\u0012", new Object[]{"b", "c", ewxg.a, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
        }
        if (iOrdinal == 3) {
            return new ewxj();
        }
        if (iOrdinal == 4) {
            return new ewxi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = s;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewxj.class) {
            evsgVar = s;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                s = evsgVar;
            }
        }
        return evsgVar;
    }
}
