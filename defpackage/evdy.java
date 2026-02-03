package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evdy extends evsn implements evui {
    public static final evdy a;
    private static volatile evuo q;
    public int b;
    public float c;
    public int d;
    public int j;
    public int n;
    public int p;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String k = "";
    public evtg l = emptyProtobufList();
    public evtg m = emptyProtobufList();
    public String o = "";

    static {
        evdy evdyVar = new evdy();
        a = evdyVar;
        evsn.registerDefaultInstance(evdy.class, evdyVar);
    }

    private evdy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0002\u0011\u000e\u0000\u0002\u0000\u0002ခ\u0000\u0003᠌\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tင\u0007\nဈ\b\f\u001b\r\u001b\u000e᠌\n\u000fဈ\u000b\u0011᠌\u000e", new Object[]{"b", "c", "d", evbt.a, "e", "f", "g", "h", "i", "j", "k", "l", evcf.class, "m", evbz.class, "n", evdu.a, "o", "p", evdx.a});
        }
        if (iOrdinal == 3) {
            return new evdy();
        }
        if (iOrdinal == 4) {
            return new evdw();
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
        synchronized (evdy.class) {
            evsgVar = q;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                q = evsgVar;
            }
        }
        return evsgVar;
    }
}
