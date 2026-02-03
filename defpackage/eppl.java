package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eppl extends evsn<eppl, eppj> implements evui {
    public static final eppl a;
    private static volatile evuo g;
    public Object c;
    public int e;
    public int b = 0;
    public String d = "";
    public String f = "";

    static {
        eppl epplVar = new eppl();
        a = epplVar;
        evsn.registerDefaultInstance(eppl.class, epplVar);
    }

    private eppl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u001d\u0001\u0000\u0001Õ\u001d\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉd<\u0000e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000o<\u0000È<\u0000É<\u0000Ê<\u0000Ë<\u0000Ì<\u0000Í<\u0000Î<\u0000Ï<\u0000Ð<\u0000Ñ<\u0000Ò<\u0000Ó<\u0000Ô<\u0000Õ<\u0000", new Object[]{"c", "b", "d", "e", "f", eppb.class, evrl.class, evrl.class, evrl.class, evrl.class, evrl.class, evrl.class, evrl.class, evrl.class, eppr.class, epoo.class, evrl.class, evrl.class, evrl.class, evrl.class, evrl.class, evrl.class, evrl.class, epoz.class, evrl.class, epox.class, epor.class, epol.class, epov.class, evrl.class, evrl.class});
        }
        if (iOrdinal == 3) {
            return new eppl();
        }
        if (iOrdinal == 4) {
            return new eppj();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eppl.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
