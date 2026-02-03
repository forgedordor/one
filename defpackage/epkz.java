package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epkz extends evsn implements evui {
    public static final epkz a;
    private static volatile evuo h;
    public long c;
    public String b = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        epkz epkzVar = new epkz();
        a = epkzVar;
        evsn.registerDefaultInstance(epkz.class, epkzVar);
    }

    private epkz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new epkz();
        }
        if (iOrdinal == 4) {
            return new epky();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epkz.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
