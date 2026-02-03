package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnyz extends evsn implements evui {
    public static final cnyz a;
    private static volatile evuo j;
    public int b;
    public Object d;
    public evvp g;
    public cnyy i;
    public int c = 0;
    public evqs e = evqs.b;
    public evtg f = emptyProtobufList();
    public evtg h = emptyProtobufList();

    static {
        cnyz cnyzVar = new cnyz();
        a = cnyzVar;
        evsn.registerDefaultInstance(cnyz.class, cnyzVar);
    }

    private cnyz() {
    }

    public final void a() {
        evtg evtgVar = this.h;
        if (evtgVar.c()) {
            return;
        }
        this.h = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0001\u0001\u0001\t\b\u0000\u0002\u0000\u0001\n\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\u001b\u0007ဉ\u0000\b\u001b\tဉ\u0001", new Object[]{"d", "c", "b", "e", cnyn.class, cnyr.class, cnyt.class, "f", cnyz.class, "g", "h", cnyz.class, "i"});
        }
        if (iOrdinal == 3) {
            return new cnyz();
        }
        if (iOrdinal == 4) {
            return new cnyu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cnyz.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
