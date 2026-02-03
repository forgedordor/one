package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eljh extends evsn implements evui {
    public static final eljh a;
    private static volatile evuo b;

    static {
        eljh eljhVar = new eljh();
        a = eljhVar;
        evsn.registerDefaultInstance(eljh.class, eljhVar);
    }

    private eljh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new eljh();
        }
        if (iOrdinal == 4) {
            return new eljg();
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
        synchronized (eljh.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
