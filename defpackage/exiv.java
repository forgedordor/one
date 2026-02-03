package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exiv extends evsn implements evui {
    public static final exiv a;
    private static volatile evuo e;
    public String b = "";
    public String c = "";
    public String d = "";
    private int f;

    static {
        exiv exivVar = new exiv();
        a = exivVar;
        evsn.registerDefaultInstance(exiv.class, exivVar);
    }

    private exiv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0005ဈ\u0004", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new exiv();
        }
        if (iOrdinal == 4) {
            return new exiu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exiv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
