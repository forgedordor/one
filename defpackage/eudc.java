package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudc extends evsn implements evui {
    public static final eudc a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        eudc eudcVar = new eudc();
        a = eudcVar;
        evsn.registerDefaultInstance(eudc.class, eudcVar);
    }

    private eudc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", exdk.class, exdq.class, exdm.class, exdo.class, exdi.class, exdg.class});
        }
        if (iOrdinal == 3) {
            return new eudc();
        }
        if (iOrdinal == 4) {
            return new eudb();
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
        synchronized (eudc.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
