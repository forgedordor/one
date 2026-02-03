package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ensl extends evsn implements evui {
    public static final ensl a;
    private static volatile evuo p;
    public int b;
    public int c;
    public int d;
    public int i;
    public boolean j;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";

    static {
        ensl enslVar = new ensl();
        a = enslVar;
        evsn.registerDefaultInstance(ensl.class, enslVar);
    }

    private ensl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ለ\u0002\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bင\u0007\tဇ\b\nለ\t\u000bለ\n\fለ\u000b\rለ\f\u000eለ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        }
        if (iOrdinal == 3) {
            return new ensl();
        }
        if (iOrdinal == 4) {
            return new ensk();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = p;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ensl.class) {
            evsgVar = p;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                p = evsgVar;
            }
        }
        return evsgVar;
    }
}
