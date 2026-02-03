package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dien extends evsn implements evui {
    public static final dien a;
    private static volatile evuo d;
    public int b;
    public String c = "";

    static {
        dien dienVar = new dien();
        a = dienVar;
        evsn.registerDefaultInstance(dien.class, dienVar);
    }

    private dien() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0014\u0014\u0001\u0000\u0000\u0000\u0014ဈ\u0004", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new dien();
        }
        if (iOrdinal == 4) {
            return new diem();
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
        synchronized (dien.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
