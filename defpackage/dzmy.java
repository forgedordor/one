package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmy extends evsn implements evui {
    public static final dzmy a;
    private static volatile evuo g;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public float f;
    private int h;

    static {
        dzmy dzmyVar = new dzmy();
        a = dzmyVar;
        evsn.registerDefaultInstance(dzmy.class, dzmyVar);
    }

    private dzmy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new dzmy();
        }
        if (iOrdinal == 4) {
            return new dzmx();
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
        synchronized (dzmy.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
