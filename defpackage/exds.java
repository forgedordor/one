package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exds extends evsn implements evui {
    public static final exds a;
    private static volatile evuo f;
    public int b;
    public int c;
    public String d = "";
    public boolean e;

    static {
        exds exdsVar = new exds();
        a = exdsVar;
        evsn.registerDefaultInstance(exds.class, exdsVar);
    }

    private exds() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ\u0004\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new exds();
        }
        if (iOrdinal == 4) {
            return new exdr();
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
        synchronized (exds.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
