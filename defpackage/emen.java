package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emen extends evsn implements evui {
    public static final emen a;
    private static volatile evuo e;
    public int b;
    public int c;
    public evta d = emptyLongList();

    static {
        emen emenVar = new emen();
        a = emenVar;
        evsn.registerDefaultInstance(emen.class, emenVar);
    }

    private emen() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0014", new Object[]{"b", "c", emel.a, "d"});
        }
        if (iOrdinal == 3) {
            return new emen();
        }
        if (iOrdinal == 4) {
            return new emem();
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
        synchronized (emen.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
