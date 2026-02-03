package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eznm extends evsn implements evui {
    public static final eznm a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        eznm eznmVar = new eznm();
        a = eznmVar;
        evsn.registerDefaultInstance(eznm.class, eznmVar);
    }

    private eznm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0010\u0001\u0000\u0001x\u0010\u0000\u0000\u0000\u0001\fg<\u0000j<\u0000k<\u0000l<\u0000n<\u0000o<\u0000p<\u0000q<\u0000r<\u0000s<\u0000t<\u0000u<\u0000v<\u0000w<\u0000x<\u0000", new Object[]{"c", "b", "d", ezus.class, ezvq.class, ezuw.class, ezuq.class, ezwe.class, ezum.class, ezwc.class, ezuo.class, ezwm.class, ezvo.class, ezvk.class, ezvy.class, ezwk.class, ezvs.class, ezvm.class});
        }
        if (iOrdinal == 3) {
            return new eznm();
        }
        if (iOrdinal == 4) {
            return new eznl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eznm.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
