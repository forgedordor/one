package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cszt extends evsn implements evui {
    public static final cszt a;
    private static volatile evuo q;
    public int b;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public ctaf l;
    public evvp m;
    public int o;
    public cklv p;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String k = "";
    public evtg n = emptyProtobufList();

    static {
        cszt csztVar = new cszt();
        a = csztVar;
        evsn.registerDefaultInstance(cszt.class, csztVar);
    }

    private cszt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\u0004\u0007\u0004\b\u0004\tȈ\nဉ\u0000\u000bဉ\u0001\f\u001b\r\u0004\u000eဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", ctab.class, "o", "p"});
        }
        if (iOrdinal == 3) {
            return new cszt();
        }
        if (iOrdinal == 4) {
            return new cszs();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = q;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cszt.class) {
            evsgVar = q;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                q = evsgVar;
            }
        }
        return evsgVar;
    }
}
