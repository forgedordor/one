package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewgz extends evsn implements evui {
    public static final ewgz a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        ewgz ewgzVar = new ewgz();
        a = ewgzVar;
        evsn.registerDefaultInstance(ewgz.class, ewgzVar);
    }

    private ewgz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ewgz();
        }
        if (iOrdinal == 4) {
            return new ewgy();
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
        synchronized (ewgz.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
