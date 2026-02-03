package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class citg extends evsn implements evui {
    public static final citg a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public aubq d;
    public String e;
    public auib f;

    static {
        citg citgVar = new citg();
        a = citgVar;
        evsn.registerDefaultInstance(citg.class, citgVar);
    }

    private citg() {
        emptyProtobufList();
        this.e = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new citg();
        }
        if (iOrdinal == 4) {
            return new citf();
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
        synchronized (citg.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
