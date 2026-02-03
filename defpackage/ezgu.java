package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezgu extends evsn implements evui {
    public static final ezgu a;
    private static volatile evuo h;
    public int b;
    public int c = 0;
    public Object d;
    public ezgy e;
    public ezgy f;
    public float g;

    static {
        ezgu ezguVar = new ezgu();
        a = ezguVar;
        evsn.registerDefaultInstance(ezgu.class, ezguVar);
    }

    private ezgu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u0001", new Object[]{"d", "c", "b", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ezgu();
        }
        if (iOrdinal == 4) {
            return new ezgt();
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
        synchronized (ezgu.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
