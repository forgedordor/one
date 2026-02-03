package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exzo extends evsn implements evui {
    public static final exzo a;
    private static volatile evuo g;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        exzo exzoVar = new exzo();
        a = exzoVar;
        evsn.registerDefaultInstance(exzo.class, exzoVar);
    }

    private exzo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ\u0005ለ\u0000", new Object[]{"d", "c", "b", exzr.class, exzg.class, exzu.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new exzo();
        }
        if (iOrdinal == 4) {
            return new exzn();
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
        synchronized (exzo.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
