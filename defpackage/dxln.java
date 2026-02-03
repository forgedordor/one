package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxln extends evsn implements evui {
    public static final evsy a = new dxll();
    public static final dxln b;
    private static volatile evuo d;
    public evsx c = emptyIntList();

    static {
        dxln dxlnVar = new dxln();
        b = dxlnVar;
        evsn.registerDefaultInstance(dxln.class, dxlnVar);
    }

    private dxln() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"c", evjy.a});
        }
        if (iOrdinal == 3) {
            return new dxln();
        }
        if (iOrdinal == 4) {
            return new dxlm();
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
        synchronized (dxln.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
