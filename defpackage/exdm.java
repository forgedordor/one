package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exdm extends evsn implements evui {
    public static final exdm a;
    private static volatile evuo d;
    public int b;
    public long c;

    static {
        exdm exdmVar = new exdm();
        a = exdmVar;
        evsn.registerDefaultInstance(exdm.class, exdmVar);
    }

    private exdm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new exdm();
        }
        if (iOrdinal == 4) {
            return new exdl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exdm.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
