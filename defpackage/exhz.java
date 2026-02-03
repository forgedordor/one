package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exhz extends evsn implements evui {
    public static final exhz a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public exee d;
    public exfi e;
    public exhx f;
    public exfy g;

    static {
        exhz exhzVar = new exhz();
        a = exhzVar;
        evsn.registerDefaultInstance(exhz.class, exhzVar);
    }

    private exhz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new exhz();
        }
        if (iOrdinal == 4) {
            return new exhy();
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
        synchronized (exhz.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
