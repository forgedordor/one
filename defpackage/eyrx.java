package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyrx extends evsn implements evui {
    public static final eyrx a;
    private static volatile evuo k;
    public int b;
    public eypt c;
    public evub d;
    public eypl e;
    public evub f;
    public String g;
    public evub h;
    public long i;
    public evqs j;
    private eypy l;
    private eysq m;
    private evub n;

    static {
        eyrx eyrxVar = new eyrx();
        a = eyrxVar;
        evsn.registerDefaultInstance(eyrx.class, eyrxVar);
    }

    private eyrx() {
        evub evubVar = evub.a;
        this.d = evubVar;
        this.n = evubVar;
        this.f = evubVar;
        this.h = evubVar;
        this.g = "";
        this.j = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0004\u0000\u0000\u0001ဉ\u0000\u00022\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u00062\u00072\bȈ\t2\n\u0002\u000b\n", new Object[]{"b", "c", "d", eyru.a, "e", "l", "m", "n", eyrt.a, "f", eyrv.a, "g", "h", eyrw.a, "i", "j"});
        }
        if (iOrdinal == 3) {
            return new eyrx();
        }
        if (iOrdinal == 4) {
            return new eyrs();
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
        synchronized (eyrx.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
