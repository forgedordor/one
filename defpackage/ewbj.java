package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewbj extends evsn implements evui {
    public static final ewbj a;
    private static volatile evuo d;
    public long b;
    public long c;
    private int e;

    static {
        ewbj ewbjVar = new ewbj();
        a = ewbjVar;
        evsn.registerDefaultInstance(ewbj.class, ewbjVar);
    }

    private ewbj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ewbj();
        }
        if (iOrdinal == 4) {
            return new ewbi();
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
        synchronized (ewbj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
