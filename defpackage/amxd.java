package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amxd extends evsn implements evui {
    public static final amxd a;
    private static volatile evuo o;
    public int b;
    public int e;
    public aubx f;
    public evvp h;
    public boolean k;
    public int m;
    private aubx p;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";
    public String j = "";
    public String l = "";
    public String n = "";

    static {
        amxd amxdVar = new amxd();
        a = amxdVar;
        evsn.registerDefaultInstance(amxd.class, amxdVar);
    }

    private amxd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004ဉ\u0000\u0005Ȉ\u0006ဉ\u0001\u0007Ȉ\bȈ\t\u0007\nȈ\u000b\u0004\fဉ\u0002\rለ\u0003", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "p", "n"});
        }
        if (iOrdinal == 3) {
            return new amxd();
        }
        if (iOrdinal == 4) {
            return new amxc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = o;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (amxd.class) {
            evsgVar = o;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                o = evsgVar;
            }
        }
        return evsgVar;
    }
}
