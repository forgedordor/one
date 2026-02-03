package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epcj extends evsn implements evui {
    public static final epcj a;
    private static volatile evuo t;
    public int b;
    public epcm c;
    public boolean g;
    public epes h;
    public boolean i;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public boolean p;
    public int q;
    public int r;
    public epcw s;
    public String d = "";
    public String e = "";
    public String f = "";
    public String j = "";
    public String o = "";

    static {
        epcj epcjVar = new epcj();
        a = epcjVar;
        evsn.registerDefaultInstance(epcj.class, epcjVar);
    }

    private epcj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0011\u0000\u0001\u0001\u0015\u0011\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0005Ȉ\u0006\u0007\u0007ဉ\u0002\b\u0007\nȈ\u000b\u0007\f\u0007\r\u0004\u000e\f\u000fȈ\u0010\u0007\u0013\f\u0014\f\u0015ဉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s"});
        }
        if (iOrdinal == 3) {
            return new epcj();
        }
        if (iOrdinal == 4) {
            return new epci();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = t;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epcj.class) {
            evsgVar = t;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                t = evsgVar;
            }
        }
        return evsgVar;
    }
}
