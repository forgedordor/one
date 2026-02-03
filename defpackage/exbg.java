package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exbg extends evsn implements evui {
    public static final exbg a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";

    static {
        exbg exbgVar = new exbg();
        a = exbgVar;
        evsn.registerDefaultInstance(exbg.class, exbgVar);
    }

    private exbg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004᠌\u0003\u0006᠌\u0005\u0007ဈ\u0006", new Object[]{"b", "c", exbo.a, "d", exbl.a, "e", exbn.a, "f", exbj.a, "g"});
        }
        if (iOrdinal == 3) {
            return new exbg();
        }
        if (iOrdinal == 4) {
            return new exbf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exbg.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
