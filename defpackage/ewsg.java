package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewsg extends evsn implements evui {
    public static final ewsg a;
    private static volatile evuo g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public ewsm f;

    static {
        ewsg ewsgVar = new ewsg();
        a = ewsgVar;
        evsn.registerDefaultInstance(ewsg.class, ewsgVar);
    }

    private ewsg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003ဉ\u0000", new Object[]{"d", "c", "b", "e", ewsv.class, "f"});
        }
        if (iOrdinal == 3) {
            return new ewsg();
        }
        if (iOrdinal == 4) {
            return new ewsf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewsg.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
