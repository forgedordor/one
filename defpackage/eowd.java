package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eowd extends evsn implements evui {
    public static final eowd a;
    private static volatile evuo l;
    public int b;
    public boolean h;
    public eozk i;
    public boolean k;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public evtg g = emptyProtobufList();
    public String j = "";

    static {
        eowd eowdVar = new eowd();
        a = eowdVar;
        evsn.registerDefaultInstance(eowd.class, eowdVar);
    }

    private eowd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u0007\u0005ဉ\u0000\u0007Ȉ\bȈ\n\u0007\u000bȈ", new Object[]{"b", "c", "e", "g", eowf.class, "h", "i", "j", "f", "k", "d"});
        }
        if (iOrdinal == 3) {
            return new eowd();
        }
        if (iOrdinal == 4) {
            return new eowc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eowd.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
