package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feim extends evsn implements evui {
    public static final feim a;
    private static volatile evuo l;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public evtg k = emptyProtobufList();

    static {
        feim feimVar = new feim();
        a = feimVar;
        evsn.registerDefaultInstance(feim.class, feimVar);
    }

    private feim() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", feil.class});
        }
        if (iOrdinal == 3) {
            return new feim();
        }
        if (iOrdinal == 4) {
            return new feij();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (feim.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}
