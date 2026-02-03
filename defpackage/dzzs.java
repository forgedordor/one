package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzzs extends evsn implements evui {
    public static final dzzs a;
    private static volatile evuo f;
    public int b;
    public dzzr d;
    public String c = "";
    public String e = "";

    static {
        dzzs dzzsVar = new dzzs();
        a = dzzsVar;
        evsn.registerDefaultInstance(dzzs.class, dzzsVar);
    }

    private dzzs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new dzzs();
        }
        if (iOrdinal == 4) {
            return new dzzn();
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
        synchronized (dzzs.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
