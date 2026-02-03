package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtsb extends evsn implements evui {
    public static final dtsb a;
    private static volatile evuo h;
    public int b;
    public evvp c;
    public boolean e;
    public dtsf f;
    public evub g = evub.a;
    public evtg d = emptyProtobufList();

    static {
        dtsb dtsbVar = new dtsb();
        a = dtsbVar;
        evsn.registerDefaultInstance(dtsb.class, dtsbVar);
    }

    private dtsb() {
    }

    public final void a() {
        evtg evtgVar = this.d;
        if (evtgVar.c()) {
            return;
        }
        this.d = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဇ\u0001\u0004ဉ\u0002\u00052", new Object[]{"b", "c", "d", dtro.class, "e", "f", "g", dtsa.a});
        }
        if (iOrdinal == 3) {
            return new dtsb();
        }
        if (iOrdinal == 4) {
            return new dtrz();
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
        synchronized (dtsb.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
