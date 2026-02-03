package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahry extends evsn implements evui {
    public static final ahry a;
    private static volatile evuo d;
    public String b = "";
    public String c = "";

    static {
        ahry ahryVar = new ahry();
        a = ahryVar;
        evsn.registerDefaultInstance(ahry.class, ahryVar);
    }

    private ahry() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ahry();
        }
        if (iOrdinal == 4) {
            return new ahrx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ahry.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
