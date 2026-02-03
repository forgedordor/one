package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqro extends evsn implements evui {
    public static final eqro a;
    private static volatile evuo s;
    public int b;
    public evub c;
    public int d;
    public String e;
    public String f;
    public evvp g;
    public boolean h;
    public boolean i;
    public int j;
    public evqs k;
    public String l;
    public String m;
    public String n;
    public long o;
    public evtg p;
    public evtg q;
    public evub r;

    static {
        eqro eqroVar = new eqro();
        a = eqroVar;
        evsn.registerDefaultInstance(eqro.class, eqroVar);
    }

    private eqro() {
        evub evubVar = evub.a;
        this.c = evubVar;
        this.r = evubVar;
        emptyProtobufList();
        emptyProtobufList();
        this.e = "";
        this.f = "";
        this.k = evqs.b;
        this.l = "";
        this.m = "";
        this.n = "";
        this.p = emptyProtobufList();
        this.q = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0010\u0000\u0001\u0001\u0018\u0010\u0002\u0002\u0000\u00012\u0004\u0004\u000bȈ\fȈ\rဉ\u0002\u000e\u0007\u000f\u0007\u0010\f\u0011\n\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015\u0002\u0016\u001b\u0017\u001b\u00182", new Object[]{"b", "c", eqrk.a, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", evvp.class, "q", evvp.class, "r", eqrj.a});
        }
        if (iOrdinal == 3) {
            return new eqro();
        }
        if (iOrdinal == 4) {
            return new eqre();
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
        synchronized (eqro.class) {
            evsgVar = s;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                s = evsgVar;
            }
        }
        return evsgVar;
    }
}
