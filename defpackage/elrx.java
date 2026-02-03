package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elrx extends evsn implements evui {
    public static final elrx a;
    private static volatile evuo l;
    public int b;
    public int c;
    public elho d;
    public int e;
    public elku f;
    public int g;
    public elvs h;
    public String i = "";
    public emff j;
    public emez k;

    static {
        elrx elrxVar = new elrx();
        a = elrxVar;
        evsn.registerDefaultInstance(elrx.class, elrxVar);
    }

    private elrx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0005ဉ\u0004\u0006᠌\u0005\u0007ဉ\u0006\bဈ\u0007\tဉ\b\nဉ\t", new Object[]{"b", "c", elrt.a, "d", "e", elru.a, "f", "g", elrv.a, "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new elrx();
        }
        if (iOrdinal == 4) {
            return new elrw();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elrx.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
