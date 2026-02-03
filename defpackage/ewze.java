package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewze extends evsn implements evui {
    public static final ewze a;
    private static volatile evuo b;

    static {
        ewze ewzeVar = new ewze();
        a = ewzeVar;
        evsn.registerDefaultInstance(ewze.class, ewzeVar);
    }

    private ewze() {
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
            return new ewze();
        }
        if (iOrdinal == 4) {
            return new ewzd();
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
        synchronized (ewze.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
