package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euab extends evsn implements evui {
    public static final euab a;
    private static volatile evuo d;
    public euaf b;
    public etzz c;
    private int e;

    static {
        euab euabVar = new euab();
        a = euabVar;
        evsn.registerDefaultInstance(euab.class, euabVar);
    }

    private euab() {
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
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new euab();
        }
        if (iOrdinal == 4) {
            return new euaa();
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
        synchronized (euab.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
