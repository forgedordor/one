package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewjh extends evsn implements evui {
    public static final ewjh a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        ewjh ewjhVar = new ewjh();
        a = ewjhVar;
        evsn.registerDefaultInstance(ewjh.class, ewjhVar);
    }

    private ewjh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002\u083f\u0000", new Object[]{"d", "c", "b", "e", ewjg.a, ewjf.a});
        }
        if (iOrdinal == 3) {
            return new ewjh();
        }
        if (iOrdinal == 4) {
            return new ewje();
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
        synchronized (ewjh.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
