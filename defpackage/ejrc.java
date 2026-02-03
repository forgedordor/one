package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrc extends evsn implements evui {
    public static final ejrc a;
    private static volatile evuo b;

    static {
        ejrc ejrcVar = new ejrc();
        a = ejrcVar;
        evsn.registerDefaultInstance(ejrc.class, ejrcVar);
    }

    private ejrc() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ejrc();
        }
        if (iOrdinal == 4) {
            return new ejrb();
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
        synchronized (ejrc.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
