package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cavk extends evsn implements evui {
    public static final cavk a;
    private static volatile evuo e;
    public String b = "";
    public int c;
    public int d;

    static {
        cavk cavkVar = new cavk();
        a = cavkVar;
        evsn.registerDefaultInstance(cavk.class, cavkVar);
    }

    private cavk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new cavk();
        }
        if (iOrdinal == 4) {
            return new cavh();
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
        synchronized (cavk.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
