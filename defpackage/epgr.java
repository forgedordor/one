package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epgr extends evsn implements evui {
    public static final epgr a;
    private static volatile evuo u;
    public int b;
    public int c;
    public ephd d;
    public ephd f;
    public int g;
    public int j;
    public int k;
    public int l;
    public ephb m;
    public int n;
    public epgz o;
    public int p;
    public epgx q;
    public epgv r;
    public epgt t;
    public String e = "";
    public String h = "";
    public String i = "";
    public String s = "";

    static {
        epgr epgrVar = new epgr();
        a = epgrVar;
        evsn.registerDefaultInstance(epgr.class, epgrVar);
    }

    private epgr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0012\u0000\u0001\u0001\u0018\u0012\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005\f\u0006Ȉ\u0007\f\b\u0004\t\f\nဉ\u0002\u000b\u0004\fဉ\u0003\r\f\u000eဉ\u0004\u0010ဉ\u0006\u0011Ȉ\u0014ဉ\b\u0018Ȉ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "i"});
        }
        if (iOrdinal == 3) {
            return new epgr();
        }
        if (iOrdinal == 4) {
            return new epgq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = u;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epgr.class) {
            evsgVar = u;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                u = evsgVar;
            }
        }
        return evsgVar;
    }
}
