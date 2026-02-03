package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjuu extends evsn implements evui {
    public static final cjuu a;
    public static final evtb u = new evtb(cjxp.e, cjxp.UNRECOGNIZED);
    public static final evtb v = new evtb(cjqo.e, cjqo.UNRECOGNIZED);
    private static volatile evuo w;
    private evub A;
    public int b;
    public String c;
    public evub d;
    public String e;
    public cjxn f;
    public evub g;
    public evub h;
    public evub i;
    public evub j;
    public evub k;
    public evub l;
    public evub m;
    public evub n;
    public boolean o;
    public evtg p;
    public cjxn q;
    public evub r;
    public evub s;
    public evub t;
    private evub x;
    private evub y;
    private evub z;

    static {
        cjuu cjuuVar = new cjuu();
        a = cjuuVar;
        evsn.registerDefaultInstance(cjuu.class, cjuuVar);
    }

    private cjuu() {
        evub evubVar = evub.a;
        this.d = evubVar;
        this.x = evubVar;
        this.y = evubVar;
        this.z = evubVar;
        this.g = evubVar;
        this.h = evubVar;
        this.i = evubVar;
        this.j = evubVar;
        this.k = evubVar;
        this.l = evubVar;
        this.m = evubVar;
        this.n = evubVar;
        this.r = evubVar;
        this.s = evubVar;
        this.t = evubVar;
        this.A = evubVar;
        this.c = "";
        this.e = "";
        this.p = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0016\u0000\u0001\u0001\u0018\u0016\u0010\u0001\u0000\u0001Ȉ\u00032\u00042\u00052\u00062\u0007Ȉ\bဉ\u0000\t2\n2\u000b2\r2\u000e2\u000f2\u00102\u0011\u0007\u00122\u0013\u001b\u0014ဉ\u0001\u00152\u00162\u00172\u00182", new Object[]{"b", "c", "d", cjuc.a, "x", cjuq.a, "y", cjue.a, "z", cjus.a, "e", "f", "g", cjuj.a, "j", cjul.a, "k", cjut.a, "l", cjuk.a, "h", cjug.a, "m", cjum.a, "n", cjun.a, "o", "i", cjuf.a, "p", cjqu.class, "q", "r", cjup.a, "s", cjuo.a, "t", cjud.a, "A", cjur.a});
        }
        if (iOrdinal == 3) {
            return new cjuu();
        }
        if (iOrdinal == 4) {
            return new cjub();
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
        synchronized (cjuu.class) {
            evsgVar = w;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                w = evsgVar;
            }
        }
        return evsgVar;
    }
}
