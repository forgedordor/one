package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgtd extends evsn implements evui {
    public static final cgtd a;
    private static volatile evuo k;
    public int b;
    public evub c;
    public int d;
    public boolean e;
    public cgsx f;
    public String g;
    public evub h;
    public boolean i;
    public int j;

    static {
        cgtd cgtdVar = new cgtd();
        a = cgtdVar;
        evsn.registerDefaultInstance(cgtd.class, cgtdVar);
    }

    private cgtd() {
        evub evubVar = evub.a;
        this.c = evubVar;
        this.h = evubVar;
        this.g = "";
        this.i = true;
    }

    public final evub a() {
        evub evubVar = this.c;
        if (!evubVar.b) {
            this.c = evubVar.a();
        }
        return this.c;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\t\b\u0002\u0000\u0000\u00022\u0003င\u0000\u0004ဇ\u0001\u0005ဉ\u0002\u0006ဈ\u0003\u00072\bဇ\u0004\tင\u0005", new Object[]{"b", "c", cgtc.a, "d", "e", "f", "g", "h", cgtb.a, "i", "j"});
        }
        if (iOrdinal == 3) {
            return new cgtd();
        }
        if (iOrdinal == 4) {
            return new cgta();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cgtd.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
