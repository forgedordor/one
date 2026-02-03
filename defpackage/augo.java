package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class augo extends evsn implements evui {
    public static final augo a;
    private static volatile evuo h;
    public int b;
    public aubq c;
    public String d = "";
    public String e = "";
    public evqs f = evqs.b;
    public aubq g;

    static {
        augo augoVar = new augo();
        a = augoVar;
        evsn.registerDefaultInstance(augo.class, augoVar);
    }

    private augo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new augo();
        }
        if (iOrdinal == 4) {
            return new augn();
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
        synchronized (augo.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
