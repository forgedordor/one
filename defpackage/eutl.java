package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eutl extends evsn implements evui {
    public static final eutl a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public int e;
    public eyaz f;
    public boolean g;

    static {
        eutl eutlVar = new eutl();
        a = eutlVar;
        evsn.registerDefaultInstance(eutl.class, eutlVar);
    }

    private eutl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0005\u0007\u0006ဉ\u0003", new Object[]{"b", "c", "d", "e", "g", "f"});
        }
        if (iOrdinal == 3) {
            return new eutl();
        }
        if (iOrdinal == 4) {
            return new eutk();
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
        synchronized (eutl.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
