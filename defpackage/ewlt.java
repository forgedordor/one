package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class ewlt extends evsn implements evui {
    public static final ewlt a;
    private static volatile evuo b;

    static {
        ewlt ewltVar = new ewlt();
        a = ewltVar;
        evsn.registerDefaultInstance(ewlt.class, ewltVar);
    }

    private ewlt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ewlt();
        }
        if (iOrdinal == 4) {
            return new ewls();
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
        synchronized (ewlt.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
