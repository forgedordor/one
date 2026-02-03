package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewzi extends evsn implements evui {
    public static final ewzi a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        ewzi ewziVar = new ewzi();
        a = ewziVar;
        evsn.registerDefaultInstance(ewzi.class, ewziVar);
    }

    private ewzi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0004Ȉ", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ewzi();
        }
        if (iOrdinal == 4) {
            return new ewzh();
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
        synchronized (ewzi.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
