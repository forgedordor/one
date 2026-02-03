package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emvi extends evsn implements evui {
    public static final emvi a;
    private static volatile evuo g;
    public int b;
    public emvo c;
    public boolean d;
    public boolean e;
    public int f;

    static {
        emvi emviVar = new emvi();
        a = emviVar;
        evsn.registerDefaultInstance(emvi.class, emviVar);
    }

    private emvi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", emvg.a});
        }
        if (iOrdinal == 3) {
            return new emvi();
        }
        if (iOrdinal == 4) {
            return new emvf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emvi.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
