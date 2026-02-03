package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erxa extends evsn implements evui {
    public static final erxa a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public int e;
    public evsx f = emptyIntList();
    public evtg g = emptyProtobufList();

    static {
        erxa erxaVar = new erxa();
        a = erxaVar;
        evsn.registerDefaultInstance(erxa.class, erxaVar);
    }

    private erxa() {
    }

    public final void a() {
        evtg evtgVar = this.g;
        if (evtgVar.c()) {
            return;
        }
        this.g = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0002\u0000\u0001\u0004\u0003\f\u0004\u0004\u0005\f\u0006'\u0007\u001b", new Object[]{"b", "c", "d", "e", "f", "g", erww.class});
        }
        if (iOrdinal == 3) {
            return new erxa();
        }
        if (iOrdinal == 4) {
            return new erwz();
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
        synchronized (erxa.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
