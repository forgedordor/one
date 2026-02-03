package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqcm extends evsn implements evui {
    public static final dqcm a;
    private static volatile evuo e;
    public long b;
    public long c;
    public float d;
    private int f;

    static {
        dqcm dqcmVar = new dqcm();
        a = dqcmVar;
        evsn.registerDefaultInstance(dqcm.class, dqcmVar);
    }

    private dqcm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ခ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new dqcm();
        }
        if (iOrdinal == 4) {
            return new dqcl();
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
        synchronized (dqcm.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
