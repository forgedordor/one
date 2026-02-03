package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddfk extends evsn implements evui {
    public static final ddfk a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        ddfk ddfkVar = new ddfk();
        a = ddfkVar;
        evsn.registerDefaultInstance(ddfk.class, ddfkVar);
    }

    private ddfk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ddfi.a});
        }
        if (iOrdinal == 3) {
            return new ddfk();
        }
        if (iOrdinal == 4) {
            return new ddfj();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ddfk.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
