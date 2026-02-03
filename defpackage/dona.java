package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dona extends evsn implements evui {
    public static final dona a;
    private static volatile evuo j;
    public int b;
    public int c;
    public int g;
    public int h;
    public long i;
    public evub f = evub.a;
    public String d = "";
    public String e = "";

    static {
        dona donaVar = new dona();
        a = donaVar;
        evsn.registerDefaultInstance(dona.class, donaVar);
    }

    private dona() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u00042\u0005င\u0003\u0006င\u0004\u0007ဂ\u0005", new Object[]{"b", "c", "d", "e", "f", domy.a, "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new dona();
        }
        if (iOrdinal == 4) {
            return new domx();
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
        synchronized (dona.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
