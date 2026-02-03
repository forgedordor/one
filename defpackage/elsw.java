package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elsw extends evsn implements evui {
    public static final elsw a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public long e;

    static {
        elsw elswVar = new elsw();
        a = elswVar;
        evsn.registerDefaultInstance(elsw.class, elswVar);
    }

    private elsw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0004\u0007\u0004\u0000\u0000\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007ဂ\u0003", new Object[]{"d", "c", "b", emhg.class, emhb.class, emhd.class, "e"});
        }
        if (iOrdinal == 3) {
            return new elsw();
        }
        if (iOrdinal == 4) {
            return new elsu();
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
        synchronized (elsw.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
