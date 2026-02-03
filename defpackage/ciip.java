package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciip extends evsn implements evui {
    public static final ciip a;
    private static volatile evuo h;
    public int b;
    public long c;
    public String d = "";
    public String e = "";
    public String f = "";
    public cihz g;

    static {
        ciip ciipVar = new ciip();
        a = ciipVar;
        evsn.registerDefaultInstance(ciip.class, ciipVar);
    }

    private ciip() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ciip();
        }
        if (iOrdinal == 4) {
            return new ciio();
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
        synchronized (ciip.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
