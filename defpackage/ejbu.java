package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejbu extends evsn implements evui {
    public static final ejbu a;
    private static volatile evuo b;
    private evub c = evub.a;

    static {
        ejbu ejbuVar = new ejbu();
        a = ejbuVar;
        evsn.registerDefaultInstance(ejbu.class, ejbuVar);
    }

    private ejbu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u000b\u000b\u0001\u0001\u0000\u0000\u000b2", new Object[]{"c", ejbt.a});
        }
        if (iOrdinal == 3) {
            return new ejbu();
        }
        if (iOrdinal == 4) {
            return new ejbs();
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
        synchronized (ejbu.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
