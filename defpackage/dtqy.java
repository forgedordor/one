package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtqy extends evsn implements evui {
    public static final dtqy a;
    private static volatile evuo y;
    public int b;
    public dtqu c;
    public int f;
    public evqe g;
    public evqe h;
    public evqe i;
    public int j;
    public int k;
    public long l;
    public long m;
    public dtrk n;
    public boolean o;
    public int q;
    public int s;
    public long t;
    public feki w;
    public String d = "";
    public String e = "";
    public evtg p = emptyProtobufList();
    public evtg r = emptyProtobufList();
    public String u = "";
    public evtg v = evsn.emptyProtobufList();
    public String x = "";

    static {
        dtqy dtqyVar = new dtqy();
        a = dtqyVar;
        evsn.registerDefaultInstance(dtqy.class, dtqyVar);
    }

    private dtqy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0016\u0000\u0001\u0001年皤\u0016\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003ဂ\t\u0006ဈ\u0002\nင\u0003\u000bဂ\n\f᠌\b\rဉ\u000b\u000eဇ\f\u0010င\r\u0011\u001b\u0013᠌\u000e\u0014ဉ\u0004\u0015᠌\u0007\u0017ဂ\u000f\u0019\u001a\u001aဈ\u0010\u001bဉ\u0005\u001cဉ\u0011\u001dဉ\u0006Ϩဈ\u0013年皤ဉ\u0000", new Object[]{"b", "d", "p", dtqs.class, "l", "e", "f", "m", "k", dtqv.a, "n", "o", "q", "r", dtrm.class, "s", dvan.a, "g", "j", dtpb.a, "t", "v", "u", "h", "w", "i", "x", "c"});
        }
        if (iOrdinal == 3) {
            return new dtqy();
        }
        if (iOrdinal == 4) {
            return new dtqx();
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
        synchronized (dtqy.class) {
            evsgVar = y;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                y = evsgVar;
            }
        }
        return evsgVar;
    }
}
