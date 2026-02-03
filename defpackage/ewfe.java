package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewfe extends evsn implements evui {
    public static final ewfe a;
    private static volatile evuo g;
    public int b;
    public int d;
    public int f;
    public String c = "";
    public String e = "";

    static {
        ewfe ewfeVar = new ewfe();
        a = ewfeVar;
        evsn.registerDefaultInstance(ewfe.class, ewfeVar);
    }

    private ewfe() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", ewqz.a});
        }
        if (iOrdinal == 3) {
            return new ewfe();
        }
        if (iOrdinal == 4) {
            return new ewfd();
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
        synchronized (ewfe.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
