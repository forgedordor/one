package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eymb extends evsn implements evui {
    public static final eymb a;
    private static volatile evuo j;
    public String b;
    public eypt c;
    public evta d;
    public evub e;
    public evub f;
    public long g;
    public evub h;
    public evqs i;
    private int k;

    static {
        eymb eymbVar = new eymb();
        a = eymbVar;
        evsn.registerDefaultInstance(eymb.class, eymbVar);
    }

    private eymb() {
        evub evubVar = evub.a;
        this.e = evubVar;
        this.f = evubVar;
        this.h = evubVar;
        emptyProtobufList();
        this.b = "";
        this.d = emptyLongList();
        this.i = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\r\u0016\b\u0003\u0001\u0000\rȈ\u000eဉ\u0002\u000f%\u00102\u00132\u0014\u0002\u00152\u0016\n", new Object[]{"k", "b", "c", "d", "e", eyma.a, "f", eylz.a, "g", "h", eyly.a, "i"});
        }
        if (iOrdinal == 3) {
            return new eymb();
        }
        if (iOrdinal == 4) {
            return new eylx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eymb.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
