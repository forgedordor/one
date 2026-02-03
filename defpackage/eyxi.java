package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyxi extends evsn implements evui {
    public static final eyxi a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public evqs d = evqs.b;
    public eyxk e;

    static {
        eyxi eyxiVar = new eyxi();
        a = eyxiVar;
        evsn.registerDefaultInstance(eyxi.class, eyxiVar);
    }

    private eyxi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\n", new Object[]{"b", "c", "e", "d"});
        }
        if (iOrdinal == 3) {
            return new eyxi();
        }
        if (iOrdinal == 4) {
            return new eyxh();
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
        synchronized (eyxi.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
