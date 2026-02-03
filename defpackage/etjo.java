package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etjo extends evsn implements evui {
    private static volatile evuo A;
    public static final evsy a = new etis();
    public static final evsy b = new etit();
    public static final etjo c;
    public int d;
    public int f;
    public long i;
    public int k;
    public boolean l;
    public int o;
    public int p;
    public int q;
    public int s;
    public etjd t;
    public eveg u;
    public int v;
    public evsx e = emptyIntList();
    public evqs g = evqs.b;
    public String h = "";
    public String j = "";
    public evsx m = emptyIntList();
    public evsx n = emptyIntList();
    public String r = "";
    public String w = "";
    public String x = "";
    public String y = "";
    public evtg z = emptyProtobufList();

    static {
        etjo etjoVar = new etjo();
        c = etjoVar;
        evsn.registerDefaultInstance(etjo.class, etjoVar);
    }

    private etjo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(c, "\u0004\u0016\u0000\u0001\u0001\u001b\u0016\u0000\u0004\u0000\u0001\u0016\u0002င\u0000\u0003င\u0007\u0004ဇ\b\u0005ࠞ\u0006᠌\n\u0007᠌\u000b\t᠌\t\u000bဈ\r\fဉ\u0010\rဈ\u0004\u000eဂ\u0005\u000fဈ\u0006\u0010ဉ\u0011\u0011᠌\u0012\u0012ࠞ\u0014ည\u0002\u0017᠌\u000f\u0018ဈ\u0013\u0019ဈ\u0014\u001aဈ\u0015\u001b\u001b", new Object[]{"d", "e", "f", "k", "l", "n", etiv.a, "p", etix.a, "q", etjm.a, "o", etjf.a, "r", "t", "h", "i", "j", "u", "v", etje.a, "m", etjk.a, "g", "s", etjh.a, "w", "x", "y", "z", etjj.class});
        }
        if (iOrdinal == 3) {
            return new etjo();
        }
        if (iOrdinal == 4) {
            return new etiu();
        }
        if (iOrdinal == 5) {
            return c;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = A;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etjo.class) {
            evsgVar = A;
            if (evsgVar == null) {
                evsgVar = new evsg(c);
                A = evsgVar;
            }
        }
        return evsgVar;
    }
}
