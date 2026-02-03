package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evhe extends evsn implements evui {
    public static final evhe a;
    private static volatile evuo t;
    public int b;
    public float c;
    public int d;
    public int j;
    public int o;
    public evjm q;
    public evkc r;
    public int s;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String k = "";
    public String l = "";
    public evtg m = emptyProtobufList();
    public evtg n = emptyProtobufList();
    public String p = "";

    static {
        evhe evheVar = new evhe();
        a = evheVar;
        evsn.registerDefaultInstance(evhe.class, evheVar);
    }

    private evhe() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0011\u0000\u0001\u0002\u0012\u0011\u0000\u0002\u0000\u0002ခ\u0000\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007င\u0007\bဈ\b\t᠌\u0001\nဈ\u0002\u000bဈ\t\f\u001b\r\u001b\u000e᠌\n\u000fဈ\u000b\u0010ဉ\f\u0011ဉ\r\u0012᠌\u000e", new Object[]{"b", "c", "f", "g", "h", "i", "j", "k", "d", evhd.a, "e", "l", "m", evgy.class, "n", evhc.class, "o", evgq.a, "p", "q", "r", "s", evgo.a});
        }
        if (iOrdinal == 3) {
            return new evhe();
        }
        if (iOrdinal == 4) {
            return new evgs();
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
        synchronized (evhe.class) {
            evsgVar = t;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                t = evsgVar;
            }
        }
        return evsgVar;
    }
}
