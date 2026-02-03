package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exez extends evsn implements evui {
    public static final exez a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        exez exezVar = new exez();
        a = exezVar;
        evsn.registerDefaultInstance(exez.class, exezVar);
    }

    private exez() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", "d", exey.class, exeq.class, exeu.class, exes.class});
        }
        if (iOrdinal == 3) {
            return new exez();
        }
        if (iOrdinal == 4) {
            return new exeo();
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
        synchronized (exez.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
