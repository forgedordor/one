package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class empe extends evsn implements evui {
    public static final empe a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;

    static {
        empe empeVar = new empe();
        a = empeVar;
        evsn.registerDefaultInstance(empe.class, empeVar);
    }

    private empe() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001h\u0005\u0000\u0000\u0000\u0001ဇ\u0000e<\u0000f<\u0000g<\u0000h<\u0000", new Object[]{"d", "c", "b", "e", emoz.class, emox.class, empb.class, empd.class});
        }
        if (iOrdinal == 3) {
            return new empe();
        }
        if (iOrdinal == 4) {
            return new emov();
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
        synchronized (empe.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
