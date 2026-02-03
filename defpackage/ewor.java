package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewor extends evsn implements evui {
    public static final ewor a;
    private static volatile evuo y;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int j;
    public int l;
    public long m;
    public boolean n;
    public int o;
    public int p;
    public ewlf r;
    public ewom s;
    public ewoq t;
    public ewoe u;
    public ewqj v;
    public enpl w;
    public ewoi x;
    public evsx i = emptyIntList();
    public String k = "";
    public String q = "";

    static {
        ewor eworVar = new ewor();
        a = eworVar;
        evsn.registerDefaultInstance(ewor.class, eworVar);
    }

    private ewor() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ࠞ\b᠌\u0006\tဈ\u0007\n᠌\b\u000bဂ\t\fဇ\n\r᠌\u000b\u000e᠌\f\u000fဈ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0015ဉ\u0013\u0017ဉ\u0015", new Object[]{"b", "c", ewro.a, "d", ewoj.a, "e", "f", ewrj.a, "g", ewrk.a, "h", ewre.a, "i", ewrf.a, "j", ewrn.a, "k", "l", ewrs.a, "m", "n", "o", ewrq.a, "p", ewrc.a, "q", "r", "s", "t", "u", "v", "w", "x"});
        }
        if (iOrdinal == 3) {
            return new ewor();
        }
        if (iOrdinal == 4) {
            return new ewoa();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = y;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewor.class) {
            evsgVar = y;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                y = evsgVar;
            }
        }
        return evsgVar;
    }
}
