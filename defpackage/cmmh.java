package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmmh extends evsn implements evui {
    public static final cmmh a;
    private static volatile evuo v;
    public int b;
    public int d;
    public int e;
    public int m;
    public boolean o;
    public String c = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String n = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String t = "";
    public String u = "";

    static {
        cmmh cmmhVar = new cmmh();
        a = cmmhVar;
        evsn.registerDefaultInstance(cmmh.class, cmmhVar);
    }

    private cmmh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003င\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t\u000bင\n\fለ\u000b\rဇ\f\u000eለ\r\u000fለ\u000e\u0010ለ\u000f\u0011ለ\u0010\u0012ለ\u0011\u0013ለ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"});
        }
        if (iOrdinal == 3) {
            return new cmmh();
        }
        if (iOrdinal == 4) {
            return new cmmg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = v;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cmmh.class) {
            evsgVar = v;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                v = evsgVar;
            }
        }
        return evsgVar;
    }
}
