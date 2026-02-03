package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epjx extends evsn implements evui {
    public static final epjx a;
    private static volatile evuo u;
    public int b;
    public int d;
    public epkf e;
    public epjn f;
    public boolean h;
    public boolean i;
    public long n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public String c = "";
    public evtg g = evsn.emptyProtobufList();
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";

    static {
        epjx epjxVar = new epjx();
        a = epjxVar;
        evsn.registerDefaultInstance(epjx.class, epjxVar);
    }

    private epjx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ț\u0006\u0007\u0007Ȉ\bȈ\t\f\n\f\u000b\f\f\u0007\rȈ\u000eȈ\u000f\u0002\u0010\u0004\u0012\u0007\u0013\f", new Object[]{"b", "c", "d", "e", "f", "g", "i", "j", "k", "p", "q", "r", "h", "l", "m", "n", "o", "s", "t"});
        }
        if (iOrdinal == 3) {
            return new epjx();
        }
        if (iOrdinal == 4) {
            return new epjw();
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
        synchronized (epjx.class) {
            evsgVar = u;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                u = evsgVar;
            }
        }
        return evsgVar;
    }
}
