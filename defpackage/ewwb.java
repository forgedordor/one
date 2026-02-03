package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewwb extends evsn implements evui {
    public static final ewwb a;
    private static volatile evuo d;
    public ezpr b;
    public eypy c;
    private int e;

    static {
        ewwb ewwbVar = new ewwb();
        a = ewwbVar;
        evsn.registerDefaultInstance(ewwb.class, ewwbVar);
    }

    private ewwb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ewwb();
        }
        if (iOrdinal == 4) {
            return new ewwa();
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
        synchronized (ewwb.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
