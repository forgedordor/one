package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewqh extends evsn implements evui {
    public static final ewqh a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        ewqh ewqhVar = new ewqh();
        a = ewqhVar;
        evsn.registerDefaultInstance(ewqh.class, ewqhVar);
    }

    private ewqh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", ewqg.a, "d", ewqf.a});
        }
        if (iOrdinal == 3) {
            return new ewqh();
        }
        if (iOrdinal == 4) {
            return new ewqe();
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
        synchronized (ewqh.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
