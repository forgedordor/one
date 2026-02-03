package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewti extends evsn implements evui {
    public static final ewti a;
    private static volatile evuo f;
    public int b;
    public eyfr c;
    public String d = "";
    public String e = "";

    static {
        ewti ewtiVar = new ewti();
        a = ewtiVar;
        evsn.registerDefaultInstance(ewti.class, ewtiVar);
    }

    private ewti() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ewti();
        }
        if (iOrdinal == 4) {
            return new ewth();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewti.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
