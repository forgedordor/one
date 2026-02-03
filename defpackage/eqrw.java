package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqrw extends evsn implements evui {
    public static final eqrw a;
    private static volatile evuo k;
    public String b = "";
    public eqry c;
    public evqs d;
    public evqs e;
    public evtg f;
    public evqs g;
    public int h;
    public evrj i;
    public String j;
    private int l;

    static {
        eqrw eqrwVar = new eqrw();
        a = eqrwVar;
        evsn.registerDefaultInstance(eqrw.class, eqrwVar);
    }

    private eqrw() {
        evqs evqsVar = evqs.b;
        this.d = evqsVar;
        this.e = evqsVar;
        this.f = emptyProtobufList();
        this.g = evqsVar;
        this.j = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\n\u0004\n\u0005\u001b\u0006\n\u0007\u0004\bဉ\u0001\tȈ", new Object[]{"l", "b", "c", "d", "e", "f", eqru.class, "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new eqrw();
        }
        if (iOrdinal == 4) {
            return new eqrv();
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
        synchronized (eqrw.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}
