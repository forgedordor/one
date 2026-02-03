package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewsx extends evsn implements evui {
    public static final ewsx a;
    private static volatile evuo d;
    public String b = "";
    public long c;

    static {
        ewsx ewsxVar = new ewsx();
        a = ewsxVar;
        evsn.registerDefaultInstance(ewsx.class, ewsxVar);
    }

    private ewsx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ewsx();
        }
        if (iOrdinal == 4) {
            return new ewsw();
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
        synchronized (ewsx.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
