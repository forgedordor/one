package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewzw extends evsn implements evui {
    public static final ewzw a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        ewzw ewzwVar = new ewzw();
        a = ewzwVar;
        evsn.registerDefaultInstance(ewzw.class, ewzwVar);
    }

    private ewzw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", exaa.class, exac.class, exag.class, ewzu.class, ewzy.class});
        }
        if (iOrdinal == 3) {
            return new ewzw();
        }
        if (iOrdinal == 4) {
            return new ewzv();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewzw.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
