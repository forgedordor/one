package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eofe extends evsn implements evui {
    public static final eofe a;
    private static volatile evuo m;
    public int b;
    public int c = 0;
    public Object d;
    public evqs e;
    public evqs f;
    public evqs g;
    public eoes h;
    public eofa i;
    public eofk j;
    public eoeu k;
    public eoew l;

    static {
        eofe eofeVar = new eofe();
        a = eofeVar;
        evsn.registerDefaultInstance(eofe.class, eofeVar);
    }

    private eofe() {
        evqs evqsVar = evqs.b;
        this.e = evqsVar;
        this.f = evqsVar;
        this.g = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004<\u0000\u0006<\u0000\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005\nဉ\u0007\u000bဉ\u0006", new Object[]{"d", "c", "b", "e", "f", "g", eoem.class, eofs.class, "h", "i", "j", "l", "k"});
        }
        if (iOrdinal == 3) {
            return new eofe();
        }
        if (iOrdinal == 4) {
            return new eofc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = m;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eofe.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}
