package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewap extends evsn implements evui {
    public static final evsy a = new ewal();
    public static final evsy b = new ewam();
    public static final evsy c = new ewan();
    public static final ewap d;
    private static volatile evuo h;
    public evsx e = emptyIntList();
    public evsx f = emptyIntList();
    public evsx g = emptyIntList();

    static {
        ewap ewapVar = new ewap();
        d = ewapVar;
        evsn.registerDefaultInstance(ewap.class, ewapVar);
    }

    private ewap() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = ewus.a;
            return newMessageInfo(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001ࠬ\u0002ࠬ\u0003ࠬ", new Object[]{"e", evsvVar, "g", evsvVar, "f", evsvVar});
        }
        if (iOrdinal == 3) {
            return new ewap();
        }
        if (iOrdinal == 4) {
            return new ewao();
        }
        if (iOrdinal == 5) {
            return d;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewap.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(d);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
