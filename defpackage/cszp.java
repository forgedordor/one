package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cszp extends evsn implements evui {
    public static final cszp a;
    private static volatile evuo y;
    public int b;
    public evvp g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean p;
    public boolean q;
    public int r;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public String c = "";
    public String d = "";
    public evtg e = emptyProtobufList();
    public String f = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String s = "";
    public evtg x = emptyProtobufList();

    static {
        cszp cszpVar = new cszp();
        a = cszpVar;
        evsn.registerDefaultInstance(cszp.class, cszpVar);
    }

    private cszp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005ဉ\u0000\u0006\u0007\u0007\u0007\b\u0007\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000e\u0007\u000f\u0007\u0010\u0004\u0011Ȉ\u0012\u0004\u0013\u0004\u0014\u0004\u0015\u0007\u0016\u001b", new Object[]{"b", "c", "d", "e", ctaf.class, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", cszt.class});
        }
        if (iOrdinal == 3) {
            return new cszp();
        }
        if (iOrdinal == 4) {
            return new cszo();
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
        synchronized (cszp.class) {
            evsgVar = y;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                y = evsgVar;
            }
        }
        return evsgVar;
    }
}
