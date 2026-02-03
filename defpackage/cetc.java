package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cetc extends evsn implements evui {
    public static final cetc a;
    private static volatile evuo h;
    public String b = "";
    public evqs c;
    public long d;
    public evqs e;
    public evqs f;
    public long g;

    static {
        cetc cetcVar = new cetc();
        a = cetcVar;
        evsn.registerDefaultInstance(cetc.class, cetcVar);
    }

    private cetc() {
        evqs evqsVar = evqs.b;
        this.c = evqsVar;
        this.e = evqsVar;
        this.f = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0002\u0004\n\u0005\n\u0006\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new cetc();
        }
        if (iOrdinal == 4) {
            return new cetb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cetc.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
