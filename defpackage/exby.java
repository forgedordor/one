package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exby extends evsn implements evui {
    public static final exby a;
    public static final evsl b;
    private static volatile evuo f;
    public exco c;
    public excu d;
    public exce e;
    private int g;

    static {
        exby exbyVar = new exby();
        a = exbyVar;
        evsn.registerDefaultInstance(exby.class, exbyVar);
        b = evsn.newSingularGeneratedExtension(ewuw.a, exbyVar, exbyVar, null, 284070414, evwh.MESSAGE, exby.class);
    }

    private exby() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0006ဉ\u0005", new Object[]{"g", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new exby();
        }
        if (iOrdinal == 4) {
            return new exbx();
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
        synchronized (exby.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
