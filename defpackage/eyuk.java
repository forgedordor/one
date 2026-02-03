package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyuk extends evsn implements evui {
    public static final eyuk a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public evqs d = evqs.b;
    public eypd e;
    public eypr f;

    static {
        eyuk eyukVar = new eyuk();
        a = eyukVar;
        evsn.registerDefaultInstance(eyuk.class, eyukVar);
    }

    private eyuk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eyuk();
        }
        if (iOrdinal == 4) {
            return new eyuj();
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
        synchronized (eyuk.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
