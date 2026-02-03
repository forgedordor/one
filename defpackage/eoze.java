package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoze extends evsn implements evui {
    public static final eoze a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        eoze eozeVar = new eoze();
        a = eozeVar;
        evsn.registerDefaultInstance(eoze.class, eozeVar);
    }

    private eoze() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000e\u0001\u0000\u0002\u000f\u000e\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"c", "b", eowu.class, epca.class, epfc.class, epee.class, epga.class, eovo.class, eowp.class, eoym.class, eoxr.class, epde.class, eowb.class, eoxv.class, epfn.class, eoxt.class});
        }
        if (iOrdinal == 3) {
            return new eoze();
        }
        if (iOrdinal == 4) {
            return new eozc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eoze.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
