package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etkb extends evsn implements evui {
    public static final etkb a;
    private static volatile evuo c;
    public String b = "";
    private int d;

    static {
        etkb etkbVar = new etkb();
        a = etkbVar;
        evsn.registerDefaultInstance(etkb.class, etkbVar);
    }

    private etkb() {
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
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new etkb();
        }
        if (iOrdinal == 4) {
            return new etka();
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
        synchronized (etkb.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
