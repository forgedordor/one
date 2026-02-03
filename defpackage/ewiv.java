package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewiv extends evsn implements evui {
    public static final ewiv a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public int d;

    static {
        ewiv ewivVar = new ewiv();
        a = ewivVar;
        evsn.registerDefaultInstance(ewiv.class, ewivVar);
    }

    private ewiv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ewiv();
        }
        if (iOrdinal == 4) {
            return new ewiu();
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
        synchronized (ewiv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
