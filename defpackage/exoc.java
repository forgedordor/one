package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exoc extends evsn implements evui {
    public static final evsy a = new exnz();
    public static final exoc b;
    private static volatile evuo g;
    public String c = "";
    public String d = "";
    public String e = "";
    public evsx f = emptyIntList();

    static {
        exoc exocVar = new exoc();
        b = exocVar;
        evsn.registerDefaultInstance(exoc.class, exocVar);
    }

    private exoc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004,", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new exoc();
        }
        if (iOrdinal == 4) {
            return new exoa();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exoc.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
