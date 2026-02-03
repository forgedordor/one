package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrr extends evsn implements evui {
    public static final ejrr a;
    private static volatile evuo e;
    public Object c;
    public int b = 0;
    public evqs d = evqs.b;

    static {
        ejrr ejrrVar = new ejrr();
        a = ejrrVar;
        evsn.registerDefaultInstance(ejrr.class, ejrrVar);
    }

    private ejrr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0001\u0000\t✐\b\u0000\u0000\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000ϩ\n✐<\u0000", new Object[]{"c", "b", ejsq.class, ejrg.class, ejrc.class, ejsm.class, ejrx.class, ejso.class, "d", ejsk.class});
        }
        if (iOrdinal == 3) {
            return new ejrr();
        }
        if (iOrdinal == 4) {
            return new ejrq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ejrr.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
