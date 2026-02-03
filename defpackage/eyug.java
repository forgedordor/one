package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyug extends evsn implements evui {
    public static final eyug a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        eyug eyugVar = new eyug();
        a = eyugVar;
        evsn.registerDefaultInstance(eyug.class, eyugVar);
    }

    private eyug() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001f\u0003\u0000\u0000\u0000\u0001\fe<\u0000f<\u0000", new Object[]{"c", "b", "d", eyua.class, eyui.class});
        }
        if (iOrdinal == 3) {
            return new eyug();
        }
        if (iOrdinal == 4) {
            return new eyuf();
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
        synchronized (eyug.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
