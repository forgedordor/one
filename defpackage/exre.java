package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exre extends evsn implements evui {
    public static final exre a;
    private static volatile evuo e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        exre exreVar = new exre();
        a = exreVar;
        evsn.registerDefaultInstance(exre.class, exreVar);
    }

    private exre() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"c", "b", "d", exrb.class});
        }
        if (iOrdinal == 3) {
            return new exre();
        }
        if (iOrdinal == 4) {
            return new exrc();
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
        synchronized (exre.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
