package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewnx extends evsn implements evui {
    public static final ewnx a;
    private static volatile evuo s;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;
    public int o;
    public int p;
    public int q;
    public String h = "";
    public String n = "";
    public String r = "";

    static {
        ewnx ewnxVar = new ewnx();
        a = ewnxVar;
        evsn.registerDefaultInstance(ewnx.class, ewnxVar);
    }

    private ewnx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = ewno.a;
            return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0000\u0000\u0001᠌\u0001\u0002᠌\u0002\u0003᠌\u0003\u0004ဈ\u0005\u0005င\u0006\u0006ဂ\t\bဈ\f\nင\u000e\u000bင\u000f\fင\u0010\r᠌\b\u000e᠌\u0004\u000f᠌\u0000\u0010᠌\u000b\u0011ဈ\u0011\u0012᠌\u0007", new Object[]{"b", "d", ewnn.a, "e", ewnp.a, "f", ewns.a, "h", "i", "l", "n", "o", "p", "q", "k", evsvVar, "g", ewnr.a, "c", ewnw.a, "m", ewnu.a, "r", "j", evsvVar});
        }
        if (iOrdinal == 3) {
            return new ewnx();
        }
        if (iOrdinal == 4) {
            return new ewnm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = s;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewnx.class) {
            evsgVar = s;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                s = evsgVar;
            }
        }
        return evsgVar;
    }
}
