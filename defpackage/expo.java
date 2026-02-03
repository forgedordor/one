package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class expo extends evsn implements evui {
    public static final expo a;
    private static volatile evuo d;
    public String b = "";
    public String c = "";

    static {
        expo expoVar = new expo();
        a = expoVar;
        evsn.registerDefaultInstance(expo.class, expoVar);
    }

    private expo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new expo();
        }
        if (iOrdinal == 4) {
            return new expn();
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
        synchronized (expo.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
