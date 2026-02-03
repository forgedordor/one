package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewdo extends evsn implements evui {
    public static final ewdo a;
    private static volatile evuo h;
    public int b;
    public int e;
    public boolean g;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        ewdo ewdoVar = new ewdo();
        a = ewdoVar;
        evsn.registerDefaultInstance(ewdo.class, ewdoVar);
    }

    private ewdo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ewdo();
        }
        if (iOrdinal == 4) {
            return new ewdn();
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
        synchronized (ewdo.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
