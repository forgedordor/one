package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejso extends evsn implements evui {
    public static final ejso a;
    private static volatile evuo b;

    static {
        ejso ejsoVar = new ejso();
        a = ejsoVar;
        evsn.registerDefaultInstance(ejso.class, ejsoVar);
    }

    private ejso() {
        emptyProtobufList();
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
            return new ejso();
        }
        if (iOrdinal == 4) {
            return new ejsn();
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
        synchronized (ejso.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
