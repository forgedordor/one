package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eztc extends evsn implements evui {
    public static final eztc a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public ezpp e;

    static {
        eztc eztcVar = new eztc();
        a = eztcVar;
        evsn.registerDefaultInstance(eztc.class, eztcVar);
    }

    private eztc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003ဉ\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (iOrdinal == 3) {
            return new eztc();
        }
        if (iOrdinal == 4) {
            return new eztb();
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
        synchronized (eztc.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
