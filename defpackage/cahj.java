package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cahj extends evsn implements evui {
    public static final cahj a;
    private static volatile evuo b;

    static {
        cahj cahjVar = new cahj();
        a = cahjVar;
        evsn.registerDefaultInstance(cahj.class, cahjVar);
    }

    private cahj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new cahj();
        }
        if (iOrdinal == 4) {
            return new cahi();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cahj.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
