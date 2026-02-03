package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiad extends evsn implements evui {
    public static final aiad a;
    private static volatile evuo f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        aiad aiadVar = new aiad();
        a = aiadVar;
        evsn.registerDefaultInstance(aiad.class, aiadVar);
    }

    private aiad() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", aiaa.class, ahzy.class});
        }
        if (iOrdinal == 3) {
            return new aiad();
        }
        if (iOrdinal == 4) {
            return new aiac();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (aiad.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
