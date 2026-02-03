package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnsa extends evsn implements evui {
    public static final cnsa a;
    private static volatile evuo g;
    public int b;
    public evqs c = evqs.b;
    public String d = "";
    public evvp e;
    public evvp f;

    static {
        cnsa cnsaVar = new cnsa();
        a = cnsaVar;
        evsn.registerDefaultInstance(cnsa.class, cnsaVar);
    }

    private cnsa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new cnsa();
        }
        if (iOrdinal == 4) {
            return new cnrz();
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
        synchronized (cnsa.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
