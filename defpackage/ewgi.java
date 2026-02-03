package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewgi extends evsn implements evui {
    public static final ewgi a;
    private static volatile evuo b;

    static {
        ewgi ewgiVar = new ewgi();
        a = ewgiVar;
        evsn.registerDefaultInstance(ewgi.class, ewgiVar);
    }

    private ewgi() {
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
            return new ewgi();
        }
        if (iOrdinal == 4) {
            return new ewgh();
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
        synchronized (ewgi.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
