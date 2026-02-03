package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyvp extends evsn implements evui {
    public static final eyvp a;
    private static volatile evuo c;
    public eyvi b;
    private int d;

    static {
        eyvp eyvpVar = new eyvp();
        a = eyvpVar;
        evsn.registerDefaultInstance(eyvp.class, eyvpVar);
    }

    private eyvp() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new eyvp();
        }
        if (iOrdinal == 4) {
            return new eyvo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eyvp.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
