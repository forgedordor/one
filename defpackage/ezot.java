package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezot extends evsn implements ezou {
    public static final ezot a;
    private static volatile evuo h;
    public int b;
    public evvh c;
    public ezon d;
    public evvh e;
    public evqu f;
    public evvh g;

    static {
        ezot ezotVar = new ezot();
        a = ezotVar;
        evsn.registerDefaultInstance(ezot.class, ezotVar);
    }

    private ezot() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ezot();
        }
        if (iOrdinal == 4) {
            return new ezos();
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
        synchronized (ezot.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
