package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgvu extends evsn implements evui {
    public static final fgvu a;
    private static volatile evuo c;
    public evta b = emptyLongList();

    static {
        fgvu fgvuVar = new fgvu();
        a = fgvuVar;
        evsn.registerDefaultInstance(fgvu.class, fgvuVar);
    }

    private fgvu() {
    }

    public final void a() {
        evta evtaVar = this.b;
        if (evtaVar.c()) {
            return;
        }
        this.b = evsn.mutableCopy(evtaVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new fgvu();
        }
        if (iOrdinal == 4) {
            return new fgvt();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (fgvu.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
