package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyxk extends evsn implements evui {
    public static final eyxk a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        eyxk eyxkVar = new eyxk();
        a = eyxkVar;
        evsn.registerDefaultInstance(eyxk.class, eyxkVar);
    }

    private eyxk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001=\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", eyye.class, eyxm.class});
        }
        if (iOrdinal == 3) {
            return new eyxk();
        }
        if (iOrdinal == 4) {
            return new eyxj();
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
        synchronized (eyxk.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
