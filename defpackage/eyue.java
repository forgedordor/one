package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyue extends evsn implements evui {
    public static final eyue a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public eyax d;
    public eyax e;

    static {
        eyue eyueVar = new eyue();
        a = eyueVar;
        evsn.registerDefaultInstance(eyue.class, eyueVar);
    }

    private eyue() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eyue();
        }
        if (iOrdinal == 4) {
            return new eyud();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eyue.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
