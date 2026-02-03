package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjib extends evsn implements evui {
    public static final evsy a = new cjhz();
    public static final cjib b;
    private static volatile evuo l;
    public int c;
    public cjjw d;
    public cjju e;
    public cjju f;
    public evvp h;
    public eyga i;
    public boolean j;
    public evtg g = emptyProtobufList();
    public evsx k = emptyIntList();

    static {
        cjib cjibVar = new cjib();
        b = cjibVar;
        evsn.registerDefaultInstance(cjib.class, cjibVar);
    }

    private cjib() {
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
            return newMessageInfo(b, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဇ\u0005\bࠬ", new Object[]{"c", "d", "e", "f", "g", cjij.class, "h", "i", "j", "k", cjha.a});
        }
        if (iOrdinal == 3) {
            return new cjib();
        }
        if (iOrdinal == 4) {
            return new cjia();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cjib.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
