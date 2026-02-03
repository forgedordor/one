package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evpc extends evsn implements evui {
    public static final evpc a;
    private static volatile evuo b;

    static {
        evpc evpcVar = new evpc();
        a = evpcVar;
        evsn.registerDefaultInstance(evpc.class, evpcVar);
    }

    private evpc() {
        emptyIntList();
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
            return new evpc();
        }
        if (iOrdinal == 4) {
            return new evpb();
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
        synchronized (evpc.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
