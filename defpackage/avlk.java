package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avlk extends evsn implements evui {
    public static final avlk a;
    private static volatile evuo w;
    public int b;
    public long c;
    public long d;
    public long i;
    public int n;
    public evvp s;
    public int v;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public evtg t = emptyProtobufList();
    public String u = "";

    static {
        avlk avlkVar = new avlk();
        a = avlkVar;
        evsn.registerDefaultInstance(avlk.class, avlkVar);
    }

    private avlk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0002\bለ\u0000\tለ\u0001\nለ\u0002\u000bለ\u0003\f\u0004\rለ\u0004\u000eለ\u0005\u000fለ\u0006\u0010ለ\u0007\u0011ဉ\b\u0012\u001b\u0013ለ\t\u0014င\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", avlj.class, "u", "v"});
        }
        if (iOrdinal == 3) {
            return new avlk();
        }
        if (iOrdinal == 4) {
            return new avlh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = w;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (avlk.class) {
            evsgVar = w;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                w = evsgVar;
            }
        }
        return evsgVar;
    }
}
