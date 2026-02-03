package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class eylv extends evsn implements evui {
    public static final eylv a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        eylv eylvVar = new eylv();
        a = eylvVar;
        evsn.registerDefaultInstance(eylv.class, eylvVar);
    }

    private eylv() {
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0003\u0007\u0004\u0000\u0000\u0000\u0003\f\u0005\u0004\u0006\f\u0007\f", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eylv();
        }
        if (iOrdinal == 4) {
            return new eylu();
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
        synchronized (eylv.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
