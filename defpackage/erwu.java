package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erwu extends evsn implements evui {
    public static final erwu a;
    private static volatile evuo i;
    public int b;
    public int d;
    public erwy f;
    public boolean g;
    public String c = "";
    public evtg e = emptyProtobufList();
    public evsx h = emptyIntList();

    static {
        erwu erwuVar = new erwu();
        a = erwuVar;
        evsn.registerDefaultInstance(erwu.class, erwuVar);
    }

    private erwu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\t\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\f\u0005\u001b\u0007ဉ\u0000\b\u0007\t'", new Object[]{"b", "c", "d", "e", erwr.class, "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new erwu();
        }
        if (iOrdinal == 4) {
            return new erwt();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (erwu.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
