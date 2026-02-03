package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emwi extends evsn implements evui {
    public static final emwi a;
    private static volatile evuo h;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;
    public int g;

    static {
        emwi emwiVar = new emwi();
        a = emwiVar;
        evsn.registerDefaultInstance(emwi.class, emwiVar);
    }

    private emwi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", emwf.class, emwh.class});
        }
        if (iOrdinal == 3) {
            return new emwi();
        }
        if (iOrdinal == 4) {
            return new emwd();
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
        synchronized (emwi.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
