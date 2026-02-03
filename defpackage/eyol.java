package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyol extends evsn implements evui {
    public static final eyol a;
    private static volatile evuo i;
    public int b;
    public ezpp c;
    public long d;
    public long e;
    public int f;
    public String g = "";
    public boolean h;
    private eyny j;

    static {
        eyol eyolVar = new eyol();
        a = eyolVar;
        evsn.registerDefaultInstance(eyol.class, eyolVar);
    }

    private eyol() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002\u0003\u0002\u0004\u0004\u0005Ȉ\u0006\u0007\u0007ဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j"});
        }
        if (iOrdinal == 3) {
            return new eyol();
        }
        if (iOrdinal == 4) {
            return new eyok();
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
        synchronized (eyol.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
