package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epdk extends evsn implements evui {
    public static final epdk a;
    private static volatile evuo e;
    public String b = "";
    public boolean c;
    public boolean d;

    static {
        epdk epdkVar = new epdk();
        a = epdkVar;
        evsn.registerDefaultInstance(epdk.class, epdkVar);
    }

    private epdk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002Ȉ\u0003\u0007\u0004\u0007", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new epdk();
        }
        if (iOrdinal == 4) {
            return new epdj();
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
        synchronized (epdk.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
