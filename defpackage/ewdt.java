package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewdt extends evsn implements evui {
    public static final ewdt a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        ewdt ewdtVar = new ewdt();
        a = ewdtVar;
        evsn.registerDefaultInstance(ewdt.class, ewdtVar);
    }

    private ewdt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000f᠌\u000e", new Object[]{"b", "c", ewqy.a});
        }
        if (iOrdinal == 3) {
            return new ewdt();
        }
        if (iOrdinal == 4) {
            return new ewds();
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
        synchronized (ewdt.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
