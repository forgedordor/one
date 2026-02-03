package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwl extends evsn implements evui {
    public static final alwl a;
    private static volatile evuo m;
    public int b;
    public int c;
    public aubq i;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";
    public String l = "";

    static {
        alwl alwlVar = new alwl();
        a = alwlVar;
        evsn.registerDefaultInstance(alwl.class, alwlVar);
    }

    private alwl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ဉ\u0000\bȈ\tȈ\nȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new alwl();
        }
        if (iOrdinal == 4) {
            return new alwi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = m;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (alwl.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}
