package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exmw extends evsn implements evui {
    public static final exmw a;
    private static volatile evuo d;
    private evub e = evub.a;
    public String b = "";
    public String c = "";

    static {
        exmw exmwVar = new exmw();
        a = exmwVar;
        evsn.registerDefaultInstance(exmw.class, exmwVar);
    }

    private exmw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"b", "c", "e", exmv.a});
        }
        if (iOrdinal == 3) {
            return new exmw();
        }
        if (iOrdinal == 4) {
            return new exmu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exmw.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
