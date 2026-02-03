package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyvc extends evsn implements evui {
    public static final eyvc a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        eyvc eyvcVar = new eyvc();
        a = eyvcVar;
        evsn.registerDefaultInstance(eyvc.class, eyvcVar);
    }

    private eyvc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\f\u0002:\u0000\u0003:\u0000\u0004:\u0000\u0005:\u0000\u0006:\u0000\u0007:\u0000\b<\u0000\t<\u0000\n7\u0000\u000b<\u0000\f?\u0000\r<\u0000\u000e<\u0000", new Object[]{"c", "b", "d", eyax.class, eyax.class, eyve.class, eyus.class, eyax.class});
        }
        if (iOrdinal == 3) {
            return new eyvc();
        }
        if (iOrdinal == 4) {
            return new eyvb();
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
        synchronized (eyvc.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
