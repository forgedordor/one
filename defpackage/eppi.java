package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eppi extends evsn implements evui {
    public static final eppi a;
    private static volatile evuo e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        eppi eppiVar = new eppi();
        a = eppiVar;
        evsn.registerDefaultInstance(eppi.class, eppiVar);
    }

    private eppi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u001b\u0001\u0000\u0001Õ\u001b\u0000\u0000\u0000\u0001Ȉd<\u0000e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000o<\u0000È<\u0000É<\u0000Ê<\u0000Ë<\u0000Ì<\u0000Í<\u0000Î<\u0000Ï<\u0000Ð<\u0000Ñ<\u0000Ò<\u0000Ó<\u0000Ô<\u0000Õ<\u0000", new Object[]{"c", "b", "d", evrl.class, eppf.class, eppd.class, evrl.class, eppv.class, eppt.class, epob.class, evrl.class, epoh.class, eppp.class, evrl.class, eppx.class, evrl.class, evrl.class, epqb.class, eppz.class, evrl.class, evrl.class, evrl.class, epof.class, evrl.class, evrl.class, epoj.class, epot.class, epnz.class, eppn.class});
        }
        if (iOrdinal == 3) {
            return new eppi();
        }
        if (iOrdinal == 4) {
            return new eppg();
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
        synchronized (eppi.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
