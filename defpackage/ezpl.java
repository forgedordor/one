package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezpl extends evsn implements evui {
    public static final ezpl a;
    private static volatile evuo c;
    public String b = "";

    static {
        ezpl ezplVar = new ezpl();
        a = ezplVar;
        evsn.registerDefaultInstance(ezpl.class, ezplVar);
    }

    private ezpl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ezpl();
        }
        if (iOrdinal == 4) {
            return new ezpk();
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
        synchronized (ezpl.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
