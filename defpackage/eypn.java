package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eypn extends evsn implements evui {
    public static final eypn a;
    private static volatile evuo f;
    public boolean c;
    public boolean d;
    public String b = "";
    public evtg e = emptyProtobufList();

    static {
        eypn eypnVar = new eypn();
        a = eypnVar;
        evsn.registerDefaultInstance(eypn.class, eypnVar);
    }

    private eypn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u001b", new Object[]{"b", "c", "d", "e", eypt.class});
        }
        if (iOrdinal == 3) {
            return new eypn();
        }
        if (iOrdinal == 4) {
            return new eypm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eypn.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
