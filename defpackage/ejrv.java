package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrv extends evsn implements evui {
    public static final ejrv a;
    private static volatile evuo i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ejsu h;

    static {
        ejrv ejrvVar = new ejrv();
        a = ejrvVar;
        evsn.registerDefaultInstance(ejrv.class, ejrvVar);
    }

    private ejrv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005ဉ\u0000\u0007\u000b", new Object[]{"b", "c", "d", "e", "g", "h", "f"});
        }
        if (iOrdinal == 3) {
            return new ejrv();
        }
        if (iOrdinal == 4) {
            return new ejru();
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
        synchronized (ejrv.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
