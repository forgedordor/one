package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enod extends evsn implements evui {
    public static final enod a;
    private static volatile evuo f;
    public int b;
    public long c;
    public long d;
    public enoc e;

    static {
        enod enodVar = new enod();
        a = enodVar;
        evsn.registerDefaultInstance(enod.class, enodVar);
    }

    private enod() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new enod();
        }
        if (iOrdinal == 4) {
            return new enoa();
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
        synchronized (enod.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
