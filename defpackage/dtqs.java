package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtqs extends evsn implements evui {
    public static final dtqs a;
    private static volatile evuo r;
    public int b;
    public long e;
    public int f;
    public exyx h;
    public long j;
    public exyx k;
    public int m;
    public int n;
    public evqe q;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";
    public evtg l = emptyProtobufList();
    public String o = "";
    public String p = "";

    static {
        dtqs dtqsVar = new dtqs();
        a = dtqsVar;
        evsn.registerDefaultInstance(dtqs.class, dtqsVar);
    }

    private dtqs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0001\u0000\u0002ဈ\u0001\u0004ဂ\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000f᠌\u0003\u0010ဂ\u0007\u0011᠌\t\u0012᠌\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r", new Object[]{"b", "d", "e", "g", "c", "h", "k", "l", dtrc.class, "i", "f", dtqq.a, "j", "m", dtqn.a, "n", dtql.a, "o", "p", "q"});
        }
        if (iOrdinal == 3) {
            return new dtqs();
        }
        if (iOrdinal == 4) {
            return new dtqp();
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
        synchronized (dtqs.class) {
            evsgVar = r;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                r = evsgVar;
            }
        }
        return evsgVar;
    }
}
