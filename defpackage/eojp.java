package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eojp extends evsn implements evui {
    public static final eojp a;
    private static volatile evuo i;
    public int b;
    public eoir c;
    public int d;
    public long e;
    public long f;
    public String g = "";
    public int h;

    static {
        eojp eojpVar = new eojp();
        a = eojpVar;
        evsn.registerDefaultInstance(eojp.class, eojpVar);
    }

    private eojp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006င\u0005", new Object[]{"b", "c", "d", eokr.a, "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new eojp();
        }
        if (iOrdinal == 4) {
            return new eojo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eojp.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
