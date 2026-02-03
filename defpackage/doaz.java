package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doaz extends evsn implements evui {
    public static final doaz a;
    private static volatile evuo i;
    public int b;
    public Object d;
    public donb h;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        doaz doazVar = new doaz();
        a = doazVar;
        evsn.registerDefaultInstance(doaz.class, doazVar);
    }

    private doaz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001È\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002dဉ\u0003È<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", doay.class});
        }
        if (iOrdinal == 3) {
            return new doaz();
        }
        if (iOrdinal == 4) {
            return new doaw();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (doaz.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
