package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqnj extends evsn implements evui {
    public static final eqnj a;
    private static volatile evuo b;

    static {
        eqnj eqnjVar = new eqnj();
        a = eqnjVar;
        evsn.registerDefaultInstance(eqnj.class, eqnjVar);
    }

    private eqnj() {
        evsn.emptyProtobufList();
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
            return new eqnj();
        }
        if (iOrdinal == 4) {
            return new eqni();
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
        synchronized (eqnj.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
