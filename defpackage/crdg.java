package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crdg extends evsn implements evui {
    public static final evsy a = new crde();
    public static final crdg b;
    private static volatile evuo d;
    public evsx c = emptyIntList();

    static {
        crdg crdgVar = new crdg();
        b = crdgVar;
        evsn.registerDefaultInstance(crdg.class, crdgVar);
    }

    private crdg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"c", ezam.a});
        }
        if (iOrdinal == 3) {
            return new crdg();
        }
        if (iOrdinal == 4) {
            return new crdf();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (crdg.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
